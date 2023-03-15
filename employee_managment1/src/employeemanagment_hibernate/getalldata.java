package employeemanagment_hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class getalldata {
	
	// Get all data in our console ( without any condiaction)

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(employee.class).configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session Session  = sf.openSession();
		Criteria crt= Session.createCriteria(employee.class);
		
		List<employee> lst= crt.list();
		
		for(employee list:lst) {
		System.out.println(list);
		
	}
		Session.close();

	}

    }
