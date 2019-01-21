package es.upm.grise.profundizacion2018.examenFinal;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;


public class GreetingTest {
	Greeting greeting;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);

	} 
	@Test
	public void smokeTest1() {
		then(this.greeting.getGreeting(null)).isEqualTo("Good morning");
	}
	
	@Test
	public void smokeTest2() {
		then(this.greeting.getGreeting(Language.ENGLISH)).isEqualTo("Good morning");
	}
	
	@Test
	public void smokeTest3() {
		then(this.greeting.getGreeting(Language.SPANISH)).isEqualTo("Buenos días");
	}

}
