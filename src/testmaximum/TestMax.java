package testmaximum;

import java.util.Arrays;

public class TestMax<T extends Comparable<T>> {
	T a;
	T b;
	T c;
	T[] args;

	@SafeVarargs
	public TestMax(T... args) {
		this.args = args;
	}

	/**
	 * Usecase4
	 * 
	 * @return
	 */
	public T findMaximum() {
		T test = findMaximum(args);

		return test;
	}

	/**
	 * Usecase5
	 * 
	 * @param max
	 */
	public void toPrint(T max) {
		System.out.println("The maximum is " + max);
	}

	/**
	 * Modified for Usecase5
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public T findMaximum(T... args) {
		T max;
		Arrays.sort(args);
		max = args[args.length - 1];
		toPrint(max);
		return max;
	}
}
