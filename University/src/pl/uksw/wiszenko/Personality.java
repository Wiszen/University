/**
 * 
 */
package pl.uksw.wiszenko;

/**
 * @author Mikolaj
 *
 */
public interface Personality {
	void printFields();
	default void sayHello(){
		System.out.println("Hello!");
	}
}
