package com.association.OneToOne;

import javax.persistence.*;


@Table (name="HiberStudent")
@Entity
public class Student {
	private String studName;
	@Id
	@GeneratedValue(generator= "",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="studsq",sequenceName = "stud_sequence")
	private int StudId;
	
	@Column (length=25)
	private String Department;
	
	@OneToOne(cascade= {CascadeType.ALL})
	
	private Address address;
	
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", StudId=" + StudId + ", address=" + address + ", Department="
				+ Department + "]";
	}
	

}
