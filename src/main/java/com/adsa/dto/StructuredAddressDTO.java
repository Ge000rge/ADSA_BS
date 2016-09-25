package com.adsa.dto;
/**
 * 
 * @author alberto.garcia
 *
 */
public class StructuredAddressDTO {
	private String street;
	private String houseNumber;
	private String city;
	private String zip;
	private String state;
	private String country;
	private String descriptiveAddress;
	private Boolean showAddressInDirectory;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	public String getDescriptiveAddress() {
		return descriptiveAddress;
	}
	public void setDescriptiveAddress(String descriptiveAddress) {
		this.descriptiveAddress = descriptiveAddress;
	}
	public Boolean getShowAddressInDirectory() {
		return showAddressInDirectory;
	}
	public void setShowAddressInDirectory(Boolean showAddressInDirectory) {
		this.showAddressInDirectory = showAddressInDirectory;
	}
	
}
