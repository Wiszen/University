/**
 * 
 */
package pl.uksw.wiszenko;

/**
 * Klasa abstrakcyjna reprezentujaca osobe na uczelni.
 * 
 * @author Mikolaj
 *
 */
public abstract class Person implements Personality{
	private String firstName;
	private String lastName;
	private boolean male;
	
	public Person(){
		this.firstName = "Brak";
		this.lastName = "Brak";
		this.male = false;
	}
	
	public Person(String firstName, String lastName, boolean male) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.male = male;
	}

	@Override
	public void printFields() {
		System.out.print("Person: " + this.getFirstName() + " " + this.getLastName() + " ");
		if(this.isMale()){
			System.out.println("Male");
		} else{
			System.out.println("Female");
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	
	
}
