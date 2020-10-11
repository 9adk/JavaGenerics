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

}
