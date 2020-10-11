package testmaximum;

public class TestMax {
	/**
	 * Usecase1
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public Integer findMaximum(Integer a, Integer b, Integer c) {
		Integer max = 0;
		if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
			max = a;
		} else if (b.compareTo(c) >= 0 && b.compareTo(a) >= 0) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}

	/**
	 * Usecase2
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public Float findMaximum(Float a, Float b, Float c) {
		Float max;
		if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
			max = a;
		} else if (b.compareTo(c) >= 0 && b.compareTo(a) >= 0) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}

	/**
	 * Usecase3
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public String findMaximum(String a, String b, String c) {
		String max;
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
