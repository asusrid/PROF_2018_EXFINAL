package es.upm.grise.profundizacion2018.examenFinal;

public class Greeting {
	
	MyCalendar myCalendar; 
	Message message;
	


	public Greeting(MyCalendar myCalendar, Message message) {
		super();
		this.myCalendar = myCalendar;
		this.message = message;
	}



	public String getGreeting( Language language ) {
		// Get current hour
		int hour = this.myCalendar.getHour();
		
		// Find out the greeting language
		if ( language == null )
			language = message.getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		return message.getMessage( moment, language );
	}

}
