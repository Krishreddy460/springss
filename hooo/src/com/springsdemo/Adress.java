package com.springsdemo;

public class Adress {

	String city;
	String state;
	int pincode;
	public Adress(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Adress()
	{
		
		// TODO Auto-generated constructor stub
	}
	
}
