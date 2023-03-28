package com.hibernate.studentmgt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name="Student")
public class Student {
	


	@Id
	@GeneratedValue
	@Column(name="sid" )
	private int sid;
	@Column(name="sname",nullable=false,length=30)
	private String sname;
	@Column(name="contact",nullable=false,length=10,unique=true)
	private String contact;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sname, String contact, Address address) {
		super();
		//this.sid = sid;
		this.sname = sname;
		this.contact = contact;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", contact=" + contact + ", address=" + address + "]";
	}
	

}

