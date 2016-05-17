package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest extends Game {

	@Test
	public void testFizzBuzzNumbers() {
		assertEquals("1", fizzBuzz(1));
	}
	@Test
	public void testFizzBuzzThree() {
		assertEquals("Fizz", fizzBuzz(3));
	}
	@Test
	public void testFizzBuzzFive() {
		assertEquals("Buzz", fizzBuzz(5));
	}
	@Test
	public void testFizzBuzzFifteen() {
		assertEquals("FizzBuzz", fizzBuzz(15));
	}
	@Test
	public void testPrintValues() {
		assertEquals("1, 2, Fizz, 4, Buzz", printValues(1, 5));
	}
	@Test
	public void testCheckValueCorrect() {
		assertEquals(true, checkValue(1, "1"));
	}
	@Test
	public void testCheckValueWrong() {
		assertEquals(false, checkValue(1, "Buzz"));
	}
}
