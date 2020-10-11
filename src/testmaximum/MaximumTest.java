package testmaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumTest {

	@Test
	public void givenFirstValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Integer actual = test.findMaximum(9, 1, 5);
		Integer expect = 9;
		assertEquals(expect, actual);
	}

	@Test
	public void givenSecondValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Integer actual = test.findMaximum(8, 11, 5);
		Integer expect = 11;
		assertEquals(expect, actual);
	}

	@Test
	public void givenThirdValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Integer actual = test.findMaximum(9, 1, 15);
		Integer expect = 15;
		assertEquals(expect, actual);
	}

	@Test
	public void givenFirstFloatValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Float actual = test.findMaximum(9f, 1f, 5f);
		Float expect = 9f;
		assertEquals(expect, actual);
	}

	@Test
	public void givenSecondFloatValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Float actual = test.findMaximum(2f, 8f, 6f);
		Float expect = 8f;
		assertEquals(expect, actual);
	}

	@Test
	public void givenThirdFloatValueShouldReturnTrue() {
		TestMax test = new TestMax();
		Float actual = test.findMaximum(9f, 1f, 15f);
		Float expect = 15f;
		assertEquals(expect, actual);
	}

}
