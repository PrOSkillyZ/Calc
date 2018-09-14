package pa.app;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 */
public class AppTest 
{
	@BeforeEach 
	public void init() {
		System.out.println("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
		App ap = new App();
		String res = ap.concat("Hello"," world!");
		// Test concat example method
		assertEquals("Hello world!", res);
	}	
    
	@Test
		void testsoma() {
		App ap = new App();
		int res = ap.soma(2, 2);
		assertEquals(4, res);
	}
	
	@Test
	void testsub() {
	App ap = new App();
	int res = ap.sub(2, 2);
	assertEquals(0, res);
}

	@Test
	void testmulti() {
	App ap = new App();
	int res = ap.sub(2, 2);
	assertEquals(4, res);
}

	@Test
	void testdivisao() {
	App ap = new App();
	int res = ap.sub(2, 2);
	assertEquals(1, res);
}
    
}
