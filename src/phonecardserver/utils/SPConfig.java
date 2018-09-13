package phonecardserver.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SPConfig {
	
	public static final int TALKPACKAGE=1;
	public static final int NETPACKAGE=2;
	public static final int SUPERPACKAGE=3;
	
	private static Properties properties=new Properties();
	
	static {
		InputStream input=SPConfig.class.getResourceAsStream("/a.properties");
		try {
			properties.load(input);
		} catch (IOException e) {
		System.out.println("�����ļ�����");
			//e.printStackTrace();
		}
		
	}
	
	public static Map<String,Object> getConfig(int packageType){
		Map<String,Object> config=new HashMap<>();
		
		switch(packageType) {
		case 1:
			config.put("ͨ��ʱ��", properties.get("talk.calltime"));
			config.put("��������", properties.get("talk.smscount"));
			config.put("�ײͼ۸�", properties.get("talk.price"));
			break;
		case 2:
			config.put("����", properties.get("net.flow"));
			config.put("�ײͼ۸�", properties.get("net.price"));
			break;
		case 3:
			config.put("ͨ��ʱ��", properties.get("super.calltime"));
			config.put("��������", properties.get("super.smscount"));
			config.put("����", properties.get("super.flow"));
			config.put("�ײͼ۸�", properties.get("super.price"));
		    break;
		    default:
		    	System.out.println("����");
		}
		return config;
	}

}
