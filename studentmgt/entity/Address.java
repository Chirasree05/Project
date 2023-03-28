package com.hibernate.studentmgt.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
	

	@Entity
	public class Address 
	{
	  
	 @Id
	 @GeneratedValue
	  private int aid;
	  private int hno;
	  private String city;
	  private String state;
	  private String pin;
	  
	  public Address() {
			
		}
	  
	  public Address(int hno, String city, String state, String pin) {
			super();
			//this.aid = aid;
			this.hno = hno;
			this.city = city;
			this.state = state;
			this.pin = pin;
		}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", hno=" + hno + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
}

