package chapter11.randomaccessfile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadProperties {
	public static void main(String[] args) throws IOException {
		InputStream is=ReadProperties.class.getResourceAsStream("/config.properties");
		Properties p=new Properties();
		p.load(is);
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		System.out.println(username+"\t"+password);
	}
}
