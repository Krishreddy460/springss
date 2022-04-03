package com.springsdemo;

public class Employee12
{

	int emid;
	String empname;
	String email;
	
	Adress ad;

	public Employee12() {
		System.out.print("object created");
	}

	public Employee12( Adress ad) {
		this.ad=ad;
	}

	@Override
	public String toString() {
		return "Employee12 [emid=" + emid + ", empname=" + empname + ", email=" + email + ", ad=" + ad + "]";
	}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAd() {
		return ad;
	}

	public void setAd(Adress ad) {
		this.ad = ad;
	}

}
