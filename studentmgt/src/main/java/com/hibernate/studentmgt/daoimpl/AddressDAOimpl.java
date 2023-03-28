package com.hibernate.studentmgt.daoimpl;
import com.hibernate.studentmgt.dao.AddressDAO;
import com.hibernate.studentmgt.entity.Address;
import com.hibernate.studentmgt.util.HiberUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class AddressDAOimpl implements AddressDAO {

	HiberUtil hu=new HiberUtil();
	Session s = hu.getSession();

	// to insert address
	@Override
	public void insertAddress(int hno, String city, String state, String pin) {

		Address add = new Address(hno, city, state, pin);
		Transaction tx = s.beginTransaction();
		s.save(add);
		tx.commit();
		s.close();

	}

	// to update
	@Override
	public void updateAddress(int aid, int hno, String city, String state, String pin) {

		Address add =new Address(hno, city, state, pin);
		add.setHno(hno);
		add.setCity(city);
		add.setState(state);
		add.setPin(pin);

		Transaction tx = s.beginTransaction();
		s.update(add);
		tx.commit();
		s.close();

	}
	

	// to delete
	@Override
	public void deletetAddress(int aid) {

		Address add = s.get(Address.class, aid);

		Transaction tx = s.beginTransaction();
		s.delete(add);
		tx.commit();
		s.close();

	}

	// to retrieve

	@Override
	public Address viewAddress(int aid) {

		return s.get(Address.class, aid);

	}

}
