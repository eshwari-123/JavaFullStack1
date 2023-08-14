package com.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream=Stream.of(12,45,67,89);
		stream.map((e)->e*e).forEach(System.out::println);
		
		
		List<String> iList=Arrays.asList("PC","Mainframe","Laptop","teleprint");
		List<String> jList=iList.stream().collect(Collectors.mapping((e)->e.toString().toString(),Collectors.toList()));
		System.out.println(jList);
		
		
		
	}

}
