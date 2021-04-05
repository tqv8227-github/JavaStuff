package LearningNewJava.classes;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	private Car car;
	public Logger log = Logger.getLogger("CarTest.class");
	
	@Before
	public void setUp() throws Exception {
		log.info("setup is called");
		car = new Car();
	}

	@After
	public void tearDown() throws Exception {
		log.info("tearDown is called.");
	}

	@Test
	public final void testSetLicensePlate() {
		car.setLicensePlate("abcde");
		assertEquals("abcde", car.getLicensePlate());
	}
	
	@Test
	public final void testGetLicensePlate() {
		String plateNumber = "Hello Kitty";
		assertNotEquals("xxx", car.getLicensePlate());
		
		car.setLicensePlate(plateNumber);
		log.info("license plate: "+car.getLicensePlate());
		assertEquals(plateNumber.toLowerCase(),car.getLicensePlate());
	}

}
