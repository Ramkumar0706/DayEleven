package builderDesignPattern;

public class BuilderDesignPatternMain {
	
	public static void main(String[] args) {
		Person p=new Builder().setPersonId(101).setPersonName("Ramkumar").getPerson();
		System.out.println(p);
	}

}
