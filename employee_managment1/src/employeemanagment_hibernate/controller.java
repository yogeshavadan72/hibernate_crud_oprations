package employeemanagment_hibernate;



import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class controller {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(employee.class).configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session Session  = sf.openSession();
		Transaction tx= Session.beginTransaction();
		
		 employee e1= new employee("mohan", 23, "account and finances", 25677);
		 employee e2= new employee("kiran", 33, "sr.sowftwere devloper", 55677);
		 employee e3= new employee("sagar", 44, "HR DEPERMENT", 45677);  
		 employee e4= new employee("lakhan", 55, "sales and markting", 55677);  
		 employee e5= new employee("yash", 66, "jr.sowftwere tester", 65677);  
		 employee e6= new employee("saurabh", 77, "HR DEPERMENT", 75677);  
		 employee e7= new employee("aditya", 88, "finance", 85677);
		 employee e8= new employee("mahesh", 99, "IT services", 95677);
		 employee e9= new employee("bharat", 11, "admin deperment ", 15677);
		 employee e10= new employee("abhi", 57, "learning and devlopment", 47677);
		 
		 List<employee> ee = new ArrayList<>();
		 ee.add(e1); //method of list to add obj. in list
		 ee.add(e2);
		 ee.add(e3);
		 ee.add(e4);
		 ee.add(e5);
		 ee.add(e6);
		 ee.add(e7);
		 ee.add(e8);
		 ee.add(e9);
		 ee.add(e10);   
		 
		    for (employee employee : ee)
	{
		    	Session.save(employee);                //insert data
				//Session.update(employee);            //update data
				//Session.delete(employee);            //delete  data
				System.out.println(employee);
     }
		 
		     tx.commit();
		     Session.close();

	 }

     }
