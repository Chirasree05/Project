package com.hibernate.studentmgt;
import java.util.Scanner;
import com.hibernate.studentmgt.entity.Address;
import com.hibernate.studentmgt.dao.StudentDAO;
import com.hibernate.studentmgt.daoimpl.StudentDAOimpl;

public class App {

	


	    public static void main( String[] args )
	    {
	    	StudentDAO sdao=new StudentDAOimpl();
	    	
	    	int k;
			 do{
	    	System.out.println("1. Create Student");
	    	System.out.println("2. View Student");
	    	System.out.println("3. Update Student");
	    	System.out.println("4. Delete Student");
	    	System.out.println("5. Exit");
	    	
	    	System.out.println("Enter choice :");
	    	Scanner sc=new Scanner(System.in);
	    	int ch=sc.nextInt();
	    	
	    	switch(ch)
	    	{
	    	//insert
	    	case 1:
	    	   
	    		System.out.println("Enter Name :");
	    		String sname=sc.next();
	    		System.out.println("Enter contact:");
	    		String contact=sc.next();
	    		System.out.println("Enter the house no:");
	    		int hno=sc.nextInt();
	    		System.out.println("Enter the City name:");
	    		String city=sc.next();
	    		System.out.println("Enter the State:");
	    		String state=sc.next();
	    		System.out.println("Enter the Pin code:");
	    		String pin=sc.next();
	    		Address add=new Address(hno,city,state,pin);
	    		sdao.insertStudent(sname,contact,add);
	    		break;
	    	    //view
	    	case 2:
	    		System.out.println("Enter Student Id :");
				int sid=sc.nextInt();
				System.out.println(sdao.getStudent(sid));
				break;
				
				
				//update
			case 3:
				System.out.println("Enter Id: ");
				sid=sc.nextInt();
				System.out.println("Enter name: ");
				sname=sc.next();
				System.out.println("Enter contact: ");
				contact=sc.next();
				System.out.println("Enter the house no:");
	    		hno=sc.nextInt();
	    		System.out.println("Enter the City name:");
	    		city=sc.next();
	    		System.out.println("Enter the State:");
	    		state=sc.next();
	    		System.out.println("Enter the Pin code:");
	    		pin=sc.next();
	    		add=new Address(hno,city,state,pin); 
				sdao.updateStudent(sid,sname,contact,add);
				 break;
			//delete
			case 4: 
				System.out.println("Enter Id ");
				 sid=sc.nextInt();
				 sdao.deleteStudent(sid);
			System.out.println("Record deleted successfully...");
			break;
	    	 //exit  
	    	case 5:System.exit(0);
	    	
	    	}
	    	System.out.println("Do you want to continue?(1/0): ");
	    	 k=sc.nextInt();
		    	}
				while(k==1);
	        
	               
	    }
	}

