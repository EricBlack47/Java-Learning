package chapter11.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCompany {
	
	public static void main(String[] args) throws IOException {
		List<Company> companies;
		companies =readCompany();
		for (Company company : companies) {
			System.out.println(company);
		}
		writeCompany(companies);
	}

	private static void writeCompany(List<Company> companies) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("e:\\company.txt"));
		bw.write("company name:\t\t\t\t tel:\r\n");
		for (Company company : companies) {
			bw.write(company.getName()+"\t\t"+company.getPhone()+"\r\n");
		}
		bw.close();
	}

	private static List<Company> readCompany() throws IOException {
		List<Company> company =new ArrayList<>();
		InputStream in=ReadCompany.class.getResourceAsStream("kunming.txt");
		InputStreamReader isr= new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		String s;
		while((s=br.readLine())!=null) {
			String[] com=s.split(" ");
			Company comp=new Company();
			comp.setName(com[0]);
			if(com.length==2) {
				comp.setPhone(com[1]);
			}
			company.add(comp);
		}
		return company;
	}

}
