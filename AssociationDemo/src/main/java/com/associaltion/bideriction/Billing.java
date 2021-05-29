package com.associaltion.bideriction;

import java.time.LocalDate;

public class Billing {
	int billingId;
	int amount;
	LocalDate orderDate;
	Customer customer;
	public int getBillingId() {
		return billingId;
	}
	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Billing [billingId=" + billingId + ", amount=" + amount + ", orderDate=" + orderDate + ", customer="
				+ customer + "]";
	}
	

}
