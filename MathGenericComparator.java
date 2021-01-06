package common;

/**
 * A math comparator for generic Numbers, such as Float, Double, Integer, Long or Byte
 * @author DiogoAlmeida
 *
 */
public class MathGenericComparator {
	
	/**
	 * Verifies if the first number is greater than the second
	 * @param <N> A Number capable of using math operators
	 * @param n1 The first number
	 * @param n2 The second Number
	 * @return
	 */
	public static <N extends Number & Comparable> boolean isGreaterThan(N n1, N n2 ){
		return n1.compareTo(n2)==1;
	}

	/**
	 * Verifies if both numbers are equal
	 * @param <N> A Number capable of using math operators
	 * @param n1 The first number
	 * @param n2 The second Number
	 * @return
	 */
	public static <N extends Number & Comparable> boolean isEqual(N n1, N n2 ){
		return n1.compareTo(n2)==0;
	}

	/**
	 * Verifies if the first number is less than the second
	 * @param <N> A Number capable of using math operators
	 * @param n1 The first number
	 * @param n2 The second Number
	 * @return
	 */
	public static <N extends Number & Comparable> boolean isLessThan(N n1, N n2 ){
		return n1.compareTo(n2)==-1;
	}

}
