package testmaximum;

public class TestMax<T extends Comparable<T>> {
	T a;
	T b;
	T c;

	public TestMax(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Usecase1, Usecase2, Usecase3 modified for Usecase4
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public T findMaximum() {
		T max;
		if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
			max = a;
		} else if (b.compareTo(c) >= 0 && b.compareTo(a) >= 0) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}
}
