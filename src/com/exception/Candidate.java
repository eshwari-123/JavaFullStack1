package com.exception;
import com.exception.*;
public class Candidate {
	
	
	
	public void acceptAge(int age) throws NumericRangeException{
		if(age<18) {
			throw new NumericRangeException(age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate obj=new Candidate();
		try {
			
			obj.acceptAge(10);
		}
		catch(NumericRangeException exception) {
			exception.printMessage();
				
			}
		}

	}


