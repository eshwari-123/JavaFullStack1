package com.exception.exercise;

import com.exception.Candidate;
import com.exception.NumericRangeException;

public class Exercise {

	
		public void acceptString(String str) throws NullLengthOfString{
			if(str.length()==0) {
				throw new NullLengthOfString(str);
			}
			else {
				System.out.println("Successful  " +str.length());
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Exercise obj=new Exercise();
			try {
				
				obj.acceptString("");
			}
			catch(NullLengthOfString exception) {
				exception.printMessage();
					
				}

	}

}
