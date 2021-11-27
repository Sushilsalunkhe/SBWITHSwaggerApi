package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int addressId;

	private String addresssStreet;

	private String addressCity;

	private String addressState;

	private String addressCountry;

	private long addressPincode;

	public Address(String addresssStreet, String addressCity, String addressState, String addressCountry,
			long addressPincode) {
		super();
		this.addresssStreet = addresssStreet;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressPincode = addressPincode;
	}
	
	

}
