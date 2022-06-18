package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date date;
	
	public Client(String name, String email, String date) throws ParseException {
		this.name = name;
		this.email = email;
		this.date = sdf.parse(date);
	}
	
	public Client() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}
	
	
}
