package chapter7.collection;

public class TestFor {
	      public static void main(String[] args){
	             String[] str = new String[5];
	             String s="asd";
	             StringBuilder sb=new StringBuilder(s);
	             sb.insert(0, "avc");
	             s=sb.toString();
	             System.out.println(s);
	             
	             for(String myStr : str){
	                    myStr= "atguigu";
	                    System.out.println(myStr);
	              }
	             for(int i = 0;i < str.length;i++){
	                    System.out.println(str[i]);
	             }
	       }
	}



