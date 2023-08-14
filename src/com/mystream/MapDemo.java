package com.mystream;

import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream=Stream.of(12,45,67,89);
		stream.map((e)->e*e).forEach(System.out::println);
	}

}
