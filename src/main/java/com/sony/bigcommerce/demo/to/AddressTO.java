package com.sony.bigcommerce.demo.to;

import java.io.Serializable;

public class AddressTO implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -8169893584957664496L;
private final String city;
private final String street;
private final String number;
public String getCity() {
	return city;
}
public String getStreet() {
	return street;
}
public String getNumber() {
	return number;
}
public AddressTO(String city, String street, String number) {
	
	this.city = city;
	this.street = street;
	this.number = number;
}

}
