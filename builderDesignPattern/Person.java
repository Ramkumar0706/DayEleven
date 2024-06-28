package builderDesignPattern;

public class Person {
	private int personId;
	private String personName;
	private String personEmail;
	private long mobileNo;
	public Person(int personId, String personName, String personEmail, long mobileNo) {
		this.personId = personId;
		this.personName = personName;
		this.personEmail = personEmail;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personEmail=" + personEmail
				+ ", mobileNo=" + mobileNo + "]";
	}
	
	
	

}
