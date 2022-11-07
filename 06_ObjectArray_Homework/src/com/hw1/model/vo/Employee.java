package com.hw1.model.vo;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bounsPoint;
	private String phone;
	private String address;
	
	public Employee() {}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String adderess) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = adderess;
	}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bounsPoint, String phone, String address) {
		this(empNo, empName, age, gender, phone, address);
		this.dept = dept;
		this.job = job;
		this.salary = salary;
		this.bounsPoint = bounsPoint;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBounsPoint() {
		return bounsPoint;
	}

	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String information() {
		return empNo + ", " + empName + ", " + dept + ", " + job + ", " + age
				+ ", " + gender + ", " + salary + ", " + bounsPoint + ", " + phone
				+ ", " + address ;
	}
	
	
	
	
}
