package com.association.OneToOne;

import javax.persistence.*;


@Entity
@Table(name="HiberAddress")
public class Address {
	@Id
	private int addressId;
	private String city;
	private int zip;
	@GeneratedValue(generator= "",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="studsq",sequenceName = "stud_sequence")
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "HiberAddress [addressId=" + addressId + ", city=" + city + ", zip=" + zip + "]";
	}
	

}
