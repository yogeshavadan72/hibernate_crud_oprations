package employeemanagment_hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class condaction {

public static void main(String[] args) {
	
		
	Configuration cfg= new Configuration();
			cfg.addAnnotatedClass(employee.class).configure();
			SessionFactory sf= cfg.buildSessionFactory();
			Session Session  = sf.openSession();
			Criteria crt= Session.createCriteria(employee.class);
			
			crt.add(Restrictions.gt("salary", 20000));                       //  condiaction is employee salary  gretter than > 20,000
			//crt.add(Restrictions.lt("salary", 20000));                     //   condiaction is employee salary  less than <20,000
			//crt.add(Restrictions.between("salary", 40000, 90000));         //   condiaction is employee salary is bewtwwn 40k to 90k
		    //crt.add(Restrictions.ge("salary", 20000));                     //   condiaction is employee salary gretterthan equalto >20,000
			//crt.add(Restrictions.le("salary", 20000));                     //   condiaction is employee salary lessthan equalto <20,000
			
			
			List<employee> lst= crt.list();
			
			for(employee list:lst) {
			System.out.println(list);
		
		}
			Session.close();
	}

}
