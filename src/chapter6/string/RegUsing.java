package chapter6.string;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegUsing {
	
     public static void main(String[] args) {
		String s ="192.168.0.156     61.37.69.69 192.168.1.126    127.0.0.1";
        s =s.replaceAll("(\\b\\d{1}\\b)","00$1");
        s =s.replaceAll("(\\b\\d{2}\\b)","0$1");
		System.out.println(s);
		Pattern pattern=Pattern.compile("(\\d{3}.){3}\\d{3}");
		Matcher matcher=pattern.matcher(s);
		TreeSet<String> ts=new TreeSet<>();
		while(matcher.find()) {
			ts.add(matcher.group());
		}
		for(String ip:ts) {
			String finalIp=ip.replaceAll("0*(\\d+)", "$1");
			System.out.println(finalIp);		
		}
	}

}
