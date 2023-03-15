package employeemanagment_hibernate;

import javax.persistence.Entity; import javax.persistence.Id;

            // pojo,entity classs

   @Entity // to creat automatically class
public class employee {        
	
	private String name;
	private int id;
	private String deparment;
	private int salary;
	
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public employee(String name, int id, String deparment, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.deparment = deparment;
		this.salary = salary;
	}
       @Id // primiry key

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDeparment() {
		return deparment;
	}


	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", deparment=" + deparment + ", salary=" + salary + "]";
	}

	

}
