package com.deep.arya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author pradeep
 *
 */
public class Address {

	@Id
	int addressid;
	private String firstLine;
	private String SecondLine;
	private String state;
	private String country;
	private int zipcode;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	public String getSecondLine() {
		return SecondLine;
	}
	public void setSecondLine(String secondLine) {
		SecondLine = secondLine;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", firstLine=" + firstLine + ", SecondLine=" + SecondLine
				+ ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	
}
