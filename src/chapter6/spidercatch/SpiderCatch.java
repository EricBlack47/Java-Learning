package chapter6.spidercatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderCatch {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://blog.sina.com.cn/s/blog_515617e60101e151.html");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		String s;
		// ≈¿≥ÊÕ¯“≥µÁª∞
		/*
		 * while((s=br.readLine())!=null) { sb.append(s); } s=sb.toString(); String
		 * phoneRegex="-(087\\d)-\\d{7}"; Pattern p=Pattern.compile(phoneRegex); Matcher
		 * m=p.matcher(s); while(m.find()) { System.out.println(m.group()); }
		 */
		// ≈¿≥ÊÕ¯“≥–≈œ¢
		/*
		 * int i=0; while((s=br.readLine())!=null) { System.out.println(s); i++; }
		 * System.out.println(i);
		 */

		// ≈¿” œ‰
		String mailRegx = "\\w+@\\w+(\\.[A-Za-z]{2,3})+";
		List<String> list = new ArrayList<>();
		Pattern p = Pattern.compile(mailRegx);
		String line = null;
		while ((line = br.readLine()) != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				list.add(m.group());
			}
			for (String mail : list) {
				String finalmail = mail.replaceAll("0*(\\d+)", "$1");
				System.out.println(finalmail);
			}

		}
	}

}
