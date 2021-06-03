package edu.evacodekitchen.employees;

public class Employee {
	
	private String firstName;

	private Gender gender;

	private String lastName;

	private Employee lineManager;

	private Long salary;

	private Title title;

	public Employee(String firstName, String lastName, Gender gender, Title title, Long salary, Employee lineManager) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.title = title;
		this.salary = salary;
		this.lineManager = lineManager;
	}

	public String getFirstName() {
		return firstName;
	}

	public Gender getGender() {
		return gender;
	}

	public String getLastName() {
		return lastName;
	}

	public Employee getLineManager() {
		return lineManager;
	}

	public Long getSalary() {
		return salary;
	}

	public Title getTitle() {
		return title;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setLineManager(Employee lineManager) {
		this.lineManager = lineManager;
	}
	
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	public void setTitle(Title title) {
		this.title = title;
	}

}
