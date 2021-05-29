package com.mobile.dist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HiberMobile")


public class Mobile {
	@Column(name="model",length=20)
 private String model;
	@Id
 private int mobileId;
 private int price;
 private String brand;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Mobile [model=" + model + ", mobileId=" + mobileId + ", price=" + price + ", brand=" + brand + "]";
}
 
}
