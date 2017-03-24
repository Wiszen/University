package pl.uksw.wiszenko;

public class UniversityPerson extends Person implements Personality {
	private int universityId;
	private String department;
	private boolean active;
	
	public UniversityPerson(String firstName, String lastName, boolean male, int universityId, String department, boolean active) {
		super(firstName, lastName, male);
		this.universityId = universityId;
		this.department = department;
		this.active = active;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public void sayHello() {
		System.out.println("Good day Sir/Madam!");
	}

	@Override
	public void printFields() {
		super.printFields();
		System.out.print(this.universityId + " " + this.department);
		if(this.active){
			System.out.println("Active");
		} else{
			System.out.println("Inactive");
		}
	}

}
