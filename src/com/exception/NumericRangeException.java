package com.exception;

public class NumericRangeException extends Exception {
	
	int number;
	public NumericRangeException(int n) {
		super("Invalid value  " +n);
		
		
		
	}
	
	public void printMessage() {
		System.out.println("invalid values enetered " +number);
	}
	
	/* super 
	 * base class consists of parameterized constructor ,
	 * super is used to pass parameters to 
	 * base class constructor
	 * --toString is inherited in all classes from object class,
	 * it is used to print all string values 
	 */
	
	
	
	
}
