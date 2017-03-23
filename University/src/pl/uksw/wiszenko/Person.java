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
public abstract class Person {
	private String firstName;
 private String lastName;
 private boolean male;
 public Person(String firstName, String lastName, boolean male){
  this.setFirst(firstName);
  this.setLastName(lastName);
  this.setMale(male);
 }
}
