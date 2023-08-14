package com.mystream.exercise;

import java.util.ArrayList;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create and store instances of customer in a list  and perform operations to get below reports 

		 List of customer as per location 
		 List of customer as per product 
		 List of customer as per payment_type(cash,card)
		 average amount_paid by Customer
		 Sum of total amount collected in list as per product*/
		ArrayList<Customer1> obj=new ArrayList<>();
		obj.add(new Customer1(1, new Product("barbie", 400, 4, true, "toy store"),200, 300, "hyd"));
		obj.add(new Customer1(2, new Product("mikky", 100, 3, false, "play store"),100, 200, "pune"));
		obj.add(new Customer1(3, new Product("jerry", 300, 6, true, "kids store"),300, 100, "mumbai"));
		obj.add(new Customer1(4, new Product("Tom", 900, 7, false, "play world"),500, 100, "delhi"));
		obj.add(new Customer1(5, new Product("chotta bheem", 600, 9, true, "toy store"),700, 300, "chennai"));

		
		
	}

}
