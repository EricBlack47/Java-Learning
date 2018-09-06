package chapter11.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StandardIO5 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Company company1=new Company();
		company1.setName("»ªÐÅÖÇÔ­");
		company1.setPhone("66666666666");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e:\\company1.txt"));
		oos.writeObject(company1);
		oos.close();
		Company company;
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:\\company1.txt"));
		company=(Company) ois.readObject();
		System.out.println(company);
		ois.close();
	}

}
