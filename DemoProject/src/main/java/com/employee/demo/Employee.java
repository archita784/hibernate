package com.employee.demo;

public class Employee {
	private String name;
	private  int empid;
	private  String city;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
