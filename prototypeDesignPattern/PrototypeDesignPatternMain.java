package prototypeDesignPattern;

import singletonDesignPattern.Employee;

public class PrototypeDesignPatternMain {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101, "Ram", "sakthiram2677", 908040);
		System.out.println(s1.toString());
		System.out.println(s1.getStudentId()+" "+s1.getStudentName()+" "+s1.getMobileNo()+" "+s1.getEmail());
		
		Student s2=(Student)s1.getClone();
		System.out.println(s2.toString());
		System.out.println(s2.getStudentId()+" "+s2.getStudentName()+" "+s2.getMobileNo()+" "+s2.getEmail());
	}

}
