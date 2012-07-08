package it.kjeldahl.cobertura;

import org.junit.Before;
import org.junit.Test;


public class ProcessorTest {

	
	private Processor subject;
	
	@Before
	public void before() {
		subject = new Processor();
		subject.seedData(42);
	}
	
	@Test
	public void testProcessing() throws Exception {
		subject.process();
	}
	
}
