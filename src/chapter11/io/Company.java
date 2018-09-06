package chapter11.io;

import java.io.Serializable;

public class Company implements Serializable {
	
	private String name;
	
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CompanyTest [name=" + name + ", phone=" + phone + "]";
	}
	

}
