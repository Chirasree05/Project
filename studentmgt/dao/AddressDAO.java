package com.hibernate.studentmgt.dao;
import com.hibernate.studentmgt.entity.Address;

public interface AddressDAO {

	
		public void insertAddress(int hno, String city, String state, String pin);

		public void updateAddress(int aid, int hno, String city, String state, String pin);

		public void deletetAddress(int aid);

		public Address viewAddress(int aid);

	}


