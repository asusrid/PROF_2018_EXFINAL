package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.given;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GreetingTest {

	private MyCalendar calendar;
	
	@Before
	public void init() {

		MockitoAnnotations.initMocks(this);
		this.calendar = new MyCalendar();
	} 
	
	
	@Test
	public void smokeTest1() {
		int hour = mock(MyCalendar.class).getHour();
		Greeting greeting = new Greeting();
		greeting.setHour(hour);
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		int hour = mock(MyCalendar.class).getHour();
		Greeting greeting = new Greeting();
		greeting.setHour(hour);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		int hour = mock(MyCalendar.class).getHour();
		Greeting greeting = new Greeting();
		greeting.setHour(hour);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}
