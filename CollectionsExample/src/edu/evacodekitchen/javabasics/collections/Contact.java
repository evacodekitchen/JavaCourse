package edu.evacodekitchen.javabasics.collections;

public class Contact {

	private String company;
	private String email;
	private String name;

	public Contact(String name, String email, String company) {
		super();
		this.company = company;
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getJobTitle() {
		return company;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setJobTitle(String jobTitle) {
		this.company = jobTitle;
	}

	public void setName(String name) {
		this.name = name;
	}

}
