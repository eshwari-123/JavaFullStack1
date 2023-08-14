package com.mystream;

import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//filter uses a predicate
		Stream<Integer> stream=Stream.of(12,34,5,68,90);
		stream.filter((e)->e>15).forEach(System.out::println);
		System.out.println(stream.findFirst().get());
		System.out.println(stream.findAny().get());
		
		
		
		
	}

}
