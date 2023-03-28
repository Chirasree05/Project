package com.hibernate.studentmgt.daoimpl;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.studentmgt.dao.StudentDAO;
import com.hibernate.studentmgt.entity.Address;
import com.hibernate.studentmgt.entity.Student;
import com.hibernate.studentmgt.util.HiberUtil;

public class StudentDAOimpl implements StudentDAO{
	
		
		HiberUtil hu=new HiberUtil();
		Session session=hu.getSession();
		
		@Override
		public void insertStudent(String sname,String contact,Address add) {
			Transaction tx=session.beginTransaction();
			Student s=new Student(sname,contact,add);
			 session.save(s);
			tx.commit();
		     System.out.println("Record inserted successfully....");
		}

		@Override
		public void updateStudent(int sid,String sname,String contact,Address add) {
			Student s=getStudent(sid);
			s.setSname(sname);
			s.setContact(contact);
			s.setAddress(add);
			Transaction tx=session.beginTransaction();
			session.update(s);
			tx.commit();
			System.out.println("Updated Successfully....");
			
		}


		@Override
		public void deleteStudent(int sid) {
			Student s = session.get(Student.class, sid);
			Transaction tx = session.beginTransaction();
			session.delete(s);
			tx.commit();
			session.close();
		}


		@Override
		public Student getStudent(int sid) {
			return session.get(Student.class, sid);
		}


	}


