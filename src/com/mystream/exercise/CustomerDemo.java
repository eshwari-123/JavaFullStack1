package com.mystream.exercise;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.mystream.Device;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list=new ArrayList();
		list.add(new Customer("john","hyd","jio",3,999));
		list.add(new Customer("ravi","pune","airtel",4,1999));
		list.add(new Customer("shyam","bangalore","nokia",2,399));
		list.add(new Customer("erric","mumbai","vodafone",6,3999));
		list.add(new Customer("rome","mumbai","idea",7,8999));
		
		
		Stream<Customer> stream=list.stream();
		//stream.filter((e)->e.getPlanRange()>3).forEach(System.out::println);
		//stream.filter((e)->e.getAmount()>500).forEach(System.out::println);
		//stream.filter((e)->e.getLocation().equals("mumbai")).map((e)->e.getAmount()*20/100+e.getAmount()+" "+e.getLocation()).forEach(System.out::println);
		System.out.println(stream.allMatch(e->e.getPlanRange()>300));
		//System.out.println(stream.anyMatch(e->e.getPlanRange()>600));

	}

}
