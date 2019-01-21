package es.upm.grise.profundizacion2018.examenFinal;

public class Greeting {
	
	public String getGreeting( Language language ) {
		// Get current hour
		int hour = new MyCalendar().getHour();
		
		// Find out the greeting language
		if ( language == null )
			language = Message.getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		return Message.getMessage( moment, language );
	}

}
