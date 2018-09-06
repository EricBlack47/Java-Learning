package chapter3.titi;

public class SingleDemo {	
	private static SingleDemo instance;	
	private SingleDemo() {				
	}

    public static SingleDemo getInstance() {
    	if(instance==null) {
    	instance=new SingleDemo();	
    	}
		return instance;   	
    }
}
