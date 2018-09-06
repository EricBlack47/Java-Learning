package chapter8.exception;

public class Demo3{
	public static int divide(int a,int b) throws DivideException{
		if(b<=0) 
		throw new DivideException();	
		int c;
		c=a/b;
		return c;					
	}
}
class DivideException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public String getMessage() {		
			return "除数要大于零";		
		}	
}
