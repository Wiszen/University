package pl.uksw.wiszenko;

public class Teacher extends UniversityPerson implements Personality {
	private String academicTitle;
	private String subject;
	
	
	
	public Teacher(String firstName, String lastName, boolean male, int universityId, String department, boolean active, String academicTitle, String subject) {
		super(firstName, lastName, male, universityId, department, active);
		this.academicTitle = academicTitle;
		this.subject = subject;
	}
	
	@Override
	public void printFields(){
		System.out.print(academicTitle + " ");
		super.printFields();
		System.out.println();
	}
	
	@Override
	public void sayHello(){
		System.out.println("Good morning students!");
	}
	
	public String getAcademicTitle() {
		return academicTitle;
	}
	
	public void setAcademicTitle(String academicTitle) {
		this.academicTitle = academicTitle;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
