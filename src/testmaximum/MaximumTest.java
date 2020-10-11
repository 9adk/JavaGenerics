package testmaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumTest {

	@Test
	public void givenFirstValueShouldReturnTrue() {
		TestMax test = new TestMax(9, 1, 5);
		Integer actual = (Integer) test.findMaximum();
		Integer expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondValueShouldReturnTrue() {
		TestMax test = new TestMax(8, 11, 5);
		Integer actual = (Integer) test.findMaximum();
		Integer expected = 11;
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdValueShouldReturnTrue() {
		TestMax test = new TestMax(9, 1, 15);
		Integer actual = (Integer) test.findMaximum();
		Integer expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	public void givenFirstFloatValueShouldReturnTrue() {
		TestMax test = new TestMax(9f, 1f, 5f);
		Float actual = (Float) test.findMaximum();
		Float expected = 9f;
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondFloatValueShouldReturnTrue() {
		TestMax test = new TestMax(2f, 8f, 6f);
		Float actual = (Float) test.findMaximum();
		Float expected = 8f;
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdFloatValueShouldReturnTrue() {
		TestMax test = new TestMax(9f, 1f, 15f);
		Float actual = (Float) test.findMaximum();
		Float expected = 15f;
		assertEquals(expected, actual);
	}

	@Test
	public void givenFirstStringValueShouldReturnTrue() {
		TestMax test = new TestMax("Peach", "Apple", "Banana");
		String actual = (String) test.findMaximum();
		String expected = "Peach";
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondStringValueShouldReturnTrue() {
		TestMax test = new TestMax("Apple", "Peach", "Banana");
		String actual = (String) test.findMaximum();
		String expected = "Peach";
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdStringValueShouldReturnTrue() {
		TestMax test = new TestMax("Banana", "Apple", "Peach");
		String actual = (String) test.findMaximum();
		String expected = "Peach";
		assertEquals(expected, actual);
	}

}
