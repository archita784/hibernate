package com.associaltion.bideriction;

public class Customer {
	String name;
	int customerid;
	long mobile;
	Billing billing;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerid=" + customerid + ", mobile=" + mobile + ", billing=" + billing
				+ "]";
	}
	

}
