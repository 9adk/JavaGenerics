package testmaximum;

import java.util.Arrays;
public class TestMax<T extends Comparable<T>> {
	T a;
	T b;
	T c;
	T[] args;
	@SafeVarargs
	public TestMax(T ...args) {
		this.args = args;
	}
	
	public T findMaximum() {
		T test = findMaximum(args);
		return test;
	}
	/**
	 * Usecase1, Usecase2, Usecase3 modified for Usecase4
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public T findMaximum(T ...args) {
		T max;
		Arrays.sort(args);
		max = args[args.length - 1];
		return max;
	}
}
