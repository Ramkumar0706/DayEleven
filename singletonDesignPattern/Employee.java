package singletonDesignPattern;

public class Employee {
	private static Employee emp;
	private Employee() {
		
	}
	
	static Employee getinstance() {
		if(emp==null) {
			emp=new Employee();
		}
		
		return emp;
	}

}
