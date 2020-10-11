package testmaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumTest {

	@Test
	public void givenFirstValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Integer actual = test.findMaximum(9, 1, 5);
		Integer expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Integer actual = test.findMaximum(8, 11, 5);
		Integer expected = 11;
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Integer actual = test.findMaximum(9, 1, 15);
		Integer expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	public void givenFirstFloatValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Float actual = test.findMaximum(9f, 1f, 5f);
		Float expected = 9f;
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondFloatValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Float actual = test.findMaximum(2f, 8f, 6f);
		Float expected = 8f;
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdFloatValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Float actual = test.findMaximum(9f, 1f, 15f);
		Float expected = 15f;
		assertEquals(expected, actual);
	}

	@Test
	public void givenFirstStringValueShouldReturnTrue() {
		TestMax test = new TestMax();
		String actual = test.findMaximum("Peach", "Apple", "Banana");
		String expected = "Peach";
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondStringValueShouldReturnTrue() {
		TestMax test = new TestMax();
		String actual = test.findMaximum("Apple", "Peach", "Banana");
		String expected = "Peach";
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdStringValueShouldReturnTrue() {
		TestMax test = new TestMax();
		String actual = test.findMaximum("Banana", "Apple", "Peach");
		String expected = "Peach";
		assertEquals(expected, actual);
	}

}
