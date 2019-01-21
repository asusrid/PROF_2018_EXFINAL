package es.upm.grise.profundizacion2018.examenFinal;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class GreetingTest {

	@Mock Message mockMessage;
	@Mock MyCalendar mockCalendar;
	

	Greeting greeting;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);

		given(mockCalendar.getHour()).willReturn(10);
		this.greeting = new Greeting(mockCalendar, mockMessage);
	} 
	
	
	@Test
	public void smokeTest1() {
		then(this.greeting.getGreeting(null)).isEqualTo("Good morning");
	}
	
	@Test
	public void smokeTest4() {
		this.greeting.getGreeting(null);
		
		verify(mockMessage).getDefaultLanguage();
		verify(mockMessage).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
	}
	
	@Test
	public void smokeTest2() {
		then(this.greeting.getGreeting(Language.SPANISH)).isEqualTo("Buenos días");
	}

	@Test
	public void smokeTest5() {
		this.greeting.getGreeting(Language.ENGLISH);

		verify(mockMessage).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
		verify(mockMessage, never()).getDefaultLanguage();
	}

}
