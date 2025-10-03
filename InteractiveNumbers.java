package edu.westga.cs5311.numbers.controller;

import java.util.Scanner;

import edu.westga.cs5311.numbers.model.NumberPair;

/**
 * 
 * This is the driver for the number pair application with user input
 * 
 * @author Monique Brown
 * @version 09/24/2025
 * 
 */
public class InteractiveNumbers {
	private Scanner scanner;
	private NumberPair userPair;

	public InteractiveNumbers() {
		this.scanner = new Scanner(System.in);

	}

	/**
	 * This method accepts input from user and performs calculations
	 */
	public void runNumberPair() {
		System.out.println("Number Pair Test with user input:");
		System.out.println("Please enter the first number");
		String firstNumber = this.scanner.nextLine();
		int userNum1 = Integer.parseInt(firstNumber);

		System.out.println("Please enter the second number");
		String secondNumber = this.scanner.nextLine();
		int userNum2 = Integer.parseInt(secondNumber);

		this.userPair = new NumberPair(userNum1, userNum2);

		System.out.println(this.userPair.toString());
		System.out.println(" ");
		System.out.println("The sum is " + this.userPair.getSum());
		System.out.println(" ");

		System.out.println("The distance is " + this.userPair.getDistance());
		System.out.println(" ");

		System.out.println("The product is " + this.userPair.getProduct());
		System.out.println(" ");

		System.out.println("The average is " + this.userPair.getAverage());
		System.out.println(" ");

		System.out.println("The larger number is " + this.userPair.getLarger());
		System.out.println(" ");

		System.out.println("The smaller number is " + this.userPair.getSmaller());
	}

}
