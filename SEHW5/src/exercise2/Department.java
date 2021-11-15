package exercise2;

public class Department {
	
	public String name;
	public Employee[] employee;
	public Professor chair;
	public Course[] course;
	
	public Department(Employee[]emp, String name) {
		this.name= name;
		employee= new Employee[emp.length];
		for(int i=0; i<employee.length;i++) {
			employee[i]=emp[i];
		}
	}
	

}
