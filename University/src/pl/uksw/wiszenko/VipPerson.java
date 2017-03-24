package pl.uksw.wiszenko;

import java.util.Calendar;

public class VipPerson extends Person implements Personality {
	private Calendar endDate;
	private Calendar startDate;
	
	public VipPerson(String firstName, String lastName, boolean male, Calendar endDate, Calendar startDate) {
		super(firstName, lastName, male);
		this.endDate = endDate;
		this.startDate = startDate;
	}

	public int getDayToEnd(){
		return (int) (endDate.getTimeInMillis() - startDate.getTimeInMillis()) / (1000*60*60*24);
	}
	
	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
	

}
