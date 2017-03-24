/**
 * 
 */
package pl.uksw.wiszenko;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Mikolaj
 *
 */
public class Main {


	public static void main(String[] args) {
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/M/yyyy");
		Calendar start = Calendar.getInstance(), end = Calendar.getInstance();
		try{
			start.setTime(formatDate.parse("22/01/2017"));
			end.setTime(formatDate.parse("30/01/2017"));
		} catch(ParseException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		VipPerson vipPerson = new VipPerson("Frank", "Sinatra", true, start, end);
		UniversityPerson universityPerson = new UniversityPerson("Mark", "Zuckerberg", true, 90001, "IT", true);
		Teacher teacher = new Teacher("Anna", "Wesolowska", false, 91002, "Filosophy and Christianity", false, "Bechelor", "Greek Filosophy");
		Student student = new Student("Mariola", "Haliczowna", false, 90005, "Chemistry", false, "Chemistry", 3);
		
		vipPerson.sayHello();
		vipPerson.printFields();
		vipPerson.getDaysToEnd();
		System.out.println();
		universityPerson.sayHello();
		universityPerson.printFields();
		System.out.println();
		teacher.sayHello();
		teacher.printFields();
		System.out.println();
		student.sayHello();
		student.printFields();
		if(student.isLastYear()){
			System.out.println("Last year.");
		} else {
			System.out.println("Not last year.");
		}
	}

}
