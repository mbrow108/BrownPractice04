package edu.westga.cs5311.numbers.controller;

/**
 * This is the driver for the number pair application
 * 
 * @author Monique Brown
 * @version 09/24/2025
 * 
 */
public class NumberPairDriver {

	/**
	 * 
	 * Entry point for the program. It creates a Number Pair instance and calls its
	 * test method
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("<--------- NumberPairTest -------->");
		System.out.println();
		NumberPairTest view1 = new NumberPairTest();
		view1.testNumberPair();

		System.out.println("<--------- Interactive Application -------->");
		System.out.println();
		InteractiveNumbers view2 = new InteractiveNumbers();
		view2.runNumberPair();

	}

}
