package com.collector;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**List<Integer> nIntegers=Arrays.asList(12,23,45,7,89,65);
		List<Integer> sIntegers=nIntegers.stream().filter((e)->e>25).map((e)->e*e).collect(Collectors.toList());
		System.out.println(sIntegers);**/
		
		ArrayList<CallQuality> c=new ArrayList();
		c.add(new CallQuality(1, 2, 4, "94901239238"));
		c.add(new CallQuality(2, 4, 2, "94909039238"));
		c.add(new CallQuality(3, 5, 4, "94934539238"));
		c.add(new CallQuality(4, 3, 6, "94123439238"));
		c.add(new CallQuality(5, 7, 9, "93947839238"));
		
		List<String> iList=c.stream().filter((e)->e.getCallDuration()>3).map((e)->e.getMobileNumber()+","+e.getDropRate()).collect(Collectors.toList());

		System.out.println(iList);
	}

}
