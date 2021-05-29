package com.association.OneToOne;

import java.time.LocalDate;

import javax.persistence.*;



@Entity
@Table(name="HiberLicense")
public class Licence {
	
	@Id
	@Column(name="Licence_No")
	@GeneratedValue(generator= "",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="licsq",sequenceName = "lic_sequence")
	private  int licenseId;
	
	private LocalDate issueDate;
	private String type;
	public int getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Licence [licenseId=" + licenseId + ", issueDate=" + issueDate + ", type=" + type + "]";
	}
	

}
