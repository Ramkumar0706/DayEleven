package prototypeDesignPattern;

public class Student implements Prototype {
	private int studentId;
	private String studentName;
	private String email;
	private long mobileNo;
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getEmail() {
		return email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public Student(int studentId, String studentName, String email, long mobileNo) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	@Override
	public Prototype getClone() {
		return new Student(studentId, studentName, email, mobileNo);
	}
	
	
	
	
	
	

}
