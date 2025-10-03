package edu.westga.cs5311.numbers.controller;

import edu.westga.cs5311.numbers.model.NumberPair;

/**
 * This class tests the instance of number pair.
 * 
 * @author Monique Brown
 * @version 09/24/2025
 * 
 */
public class NumberPairTest {
	private NumberPair pair1;

	/**
	 * This constructor instantiates the number pair class
	 * 
	 */
	public NumberPairTest() {
		this.pair1 = new NumberPair(10, 20);

	}

	/**
	 * This method displays the results of the specified number pair instance
	 * 
	 */
	public void testNumberPair() {
		System.out.println(this.pair1.toString());
		System.out.println(" ");
		System.out.println("The expected sum is 30");
		System.out.println("The actual sum is " + this.pair1.getSum());
		System.out.println("The expected distance is 10");
		System.out.println("The actual distance is " + this.pair1.getDistance());

		System.out.println("The expected product is 200");
		System.out.println("The actual product is " + this.pair1.getProduct());

		System.out.println("The expected average is 15");
		System.out.println("The actual average is " + this.pair1.getAverage());

		System.out.println("The expected larger value is 20");
		System.out.println("The actual larger value is " + this.pair1.getLarger());

		System.out.println("The expected smaller value is 10");
		System.out.println("The actual smaller value is " + this.pair1.getSmaller());

	}

}
