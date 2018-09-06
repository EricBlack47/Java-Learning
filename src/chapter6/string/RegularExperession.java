package chapter6.string;

public class RegularExperession {
	
	public static void main(String[] args) {
		/*String s="abc  fire//work.85423ËïÎò¿Õ15825272241";
		System.out.println(s.replaceAll("\\s", "+"));
		System.out.println(s.replaceAll("\\S", "+"));
		String s1="=======>as1265.qq.cc.eeq.sx.com";
		System.out.println(s1.replaceAll("((-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}","*"));
		System.out.println(s.replaceAll("((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}", "*"));
		System.out.println(s.replaceAll("\\B", "233"));
		System.out.println(s.replaceAll("\\b", "fk"));*/
		
		String tel="18834567891";
		String rg="1[3578][0-9] {9}";
		System.out.println("tel:"+tel.matches(rg));
	}

}
