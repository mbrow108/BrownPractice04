package edu.westga.cs5311.numbers.model;

/**
 * This class will keep track of 2 integer values
 * 
 * @author Monique Brown
 * @version 09/23/2025
 */
public class NumberPair {
	private int num1;
	private int num2;

	/**
	 * This constructor initializes instant variables
	 * 
	 * @param num1 value of first number
	 * @param num2 value of second number
	 */

	public NumberPair(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * 
	 * This method displays the values stored in instant variables
	 * 
	 * @return sentence displaying variable values
	 */
	public String toString() {
		return "The number values are " + this.num1 + " and " + this.num2;

	}

	/**
	 * This method calculates the sum of two numbers
	 * 
	 * @return sum total of two values
	 */
	public int getSum() {
		return this.num1 + this.num2;

	}

	/**
	 * This method calculates the absolute values of the numbers
	 * 
	 * @return distance absolute value
	 */
	public int getDistance() {
		return Math.abs(this.num1 - this.num2);
	}

	/**
	 * This method calculates the product of the numbers
	 * 
	 * @return product multiplication of numbers
	 */
	public int getProduct() {
		return this.num1 * this.num2;
	}

	/**
	 * This method calculates the average of the numbers
	 * 
	 * @return average mean of numbers
	 */
	public double getAverage() {
		return this.getSum() / 2;
	}

	/**
	 * 
	 * This method calculates the maximum of the numbers
	 * 
	 * @return largestNumber greater of numbers
	 * 
	 */
	public int getLarger() {
		return Math.max(this.num1, this.num2);
	}

	/**
	 * This method calculates the minimum of the numbers
	 * 
	 * @return smallerNumber least of numbers
	 * 
	 */
	public int getSmaller() {
		return Math.min(this.num1, this.num2);
	}

}
