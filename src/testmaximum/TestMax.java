package testmaximum;

public class TestMax {
	/**
	 * Usecase1, Usecase2, Usecase3 modified for Usecase4
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public <T extends Comparable<T>>T findMaximum(T a, T b, T c) {
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
