package com.mystream;

import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream=Stream.of(11,23,45,67);
		Stream<Integer> stream2=Stream.of(34,56,78,90);
		Stream.concat(stream,stream2).forEach(System.out::println);
		

	}

}
