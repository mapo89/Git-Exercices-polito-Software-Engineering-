package it.polito.unitTests;

import static org.junit.Assert.*;
import org.junit.*;

public class inventoryTest {
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {

	   // MyClass is tested
	   MyClass tester = new MyClass();

	   // Tests
	   assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
	   assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
	   assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
	 } 


}
