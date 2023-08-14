package com.mystream.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LocationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create the object of customer class  and store in list 
 #use stream to get the list of customer first ,lastname and
  location as list of seperate strings */
		ArrayList<CustomerCollect> obj=new ArrayList();
		obj.add(new CustomerCollect("harish","kalyan","abc@gmail.com",new Location("Hyd","telangana")));
		obj.add(new CustomerCollect("ann","rand","xyz@gmail.com",new Location("chennai","tamilnadu")));
		obj.add(new CustomerCollect("john","kim","pqr@gmail.com",new Location("pune","bangalore")));
		obj.add(new CustomerCollect("jack","mike","dfg@gmail.com",new Location("srinagar","jammu kashmir")));
		List<String> dList=obj.stream().map((e)->e.getFirstName()+","+e.getLastName()+","+e.getLocation()).collect(Collectors.toList());
		System.out.println(dList);
		
	}

}
