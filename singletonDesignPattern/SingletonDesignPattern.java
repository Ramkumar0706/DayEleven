package singletonDesignPattern;

public class SingletonDesignPattern {
	public static void main(String[] args) {
		Employee employee = Employee.getinstance();
		System.out.println(employee);
		System.out.println(Employee.getinstance());
	}

}
