package com.example;

public class Address {
//	@Value("London")
	private String city;
	
//	@Value("England")
	private String country;
	
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "[city=" + city + ", country=" + country + "]";
	}
	
}
