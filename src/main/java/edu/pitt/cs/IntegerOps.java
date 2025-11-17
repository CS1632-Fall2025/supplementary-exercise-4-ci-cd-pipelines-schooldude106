package edu.pitt.cs;

public class IntegerOps {
	/**
	 * Computes the sum of x and y. On integer overflow, where the return value
	 * becomes larger than Integer.MAX_VALUE or less than Integer.MIN_VALUE, 0 is
	 * returned instead.
	 * 
	 * @param x First integer
	 * @param y Second integer
	 * @return Sum of x and y, or 0 if integer overflow
	 */
	public static int add(int x, int y) {
		// Check for overflow before performing addition
		// For positive overflow: if x > 0 and y > 0, check if x > Integer.MAX_VALUE - y
		if (x > 0 && y > 0 && x > Integer.MAX_VALUE - y) {
			return 0;
		}
		// For negative overflow: if x < 0 and y < 0, check if x < Integer.MIN_VALUE - y
		if (x < 0 && y < 0 && x < Integer.MIN_VALUE - y) {
			return 0;
		}
		return x + y;
	}

	/**
	 * Computes the different of x and y. On integer overflow, where the return
	 * value becomes larger than Integer.MAX_VALUE or less than Integer.MIN_VALUE,
	 * 0 is returned instead.
	 * 
	 * @param x First integer
	 * @param y Second integer
	 * @return Difference between x and y, or 0 if integer overflow
	 */
	public static int subtract(int x, int y) {
		// Check for overflow before performing subtraction
		// For positive overflow: if x > 0 and y < 0, check if x > Integer.MAX_VALUE + y
		if (x > 0 && y < 0 && x > Integer.MAX_VALUE + y) {
			return 0;
		}
		// For negative overflow: if x < 0 and y > 0, check if x < Integer.MIN_VALUE + y
		if (x < 0 && y > 0 && x < Integer.MIN_VALUE + y) {
			return 0;
		}
		return x - y;
	}
}
