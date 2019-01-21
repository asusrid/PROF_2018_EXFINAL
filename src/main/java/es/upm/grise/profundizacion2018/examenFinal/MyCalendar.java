package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {

	Calendar calendar;
		
	public MyCalendar() {
		this.calendar = Calendar.getInstance();
	}
	
	public int getHour() {
		return calendar.get( Calendar.HOUR_OF_DAY );
	}
}
