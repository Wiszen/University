package pl.uksw.wiszenko;

public class Student extends UniversityPerson implements Personality {
	private String studieProgram;
	private int semester;
	
	public Student(String firstName, String lastName, boolean male, int universityId, String department, boolean active,
			String studieProgram, int semester) {
		super(firstName, lastName, male, universityId, department, active);
		this.studieProgram = studieProgram;
		this.semester = semester;
	}

	@Override
	public void sayHello(){
		System.out.println("Hi!");
	}
	
	@Override
	public void printFields(){
		super.printFields();
		System.out.println(studieProgram + " " + semester);
	}
	
	public boolean isLastYear(){
		return semester >= 3;
	}
	
	public String getStudieProgram() {
		return studieProgram;
	}

	public void setStudieProgram(String studieProgram) {
		this.studieProgram = studieProgram;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	
}
