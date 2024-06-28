package builderDesignPattern;

public class Builder {
	private int personId;
	private String personName;
	private String personEmail;
	private long mobileNo;
	
	public Builder setPersonId(int personId) {
		this.personId = personId;
		return this;
	}
	
	public Builder setPersonName(String personName) {
		this.personName = personName;
		return this;
	}
	
	public Builder setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
		return this;
	}
	
	public Builder setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}
	
	public Person getPerson() {
		return new Person(personId, personName, personEmail, mobileNo);
	}
	

}
