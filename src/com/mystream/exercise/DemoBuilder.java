package com.mystream.exercise;

import java.util.stream.Stream;

public class DemoBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.Builder<String> builder=Stream.builder();
		builder.add("BaudRate");
		builder.add("ohm");
		builder.add("kiloWatt");
		builder.add("Bits");
		builder.add("Analog");
		builder.add("Digital");
		Stream<String> stream5=builder.build();
		stream5.forEach(System.out::println);
		Stream<Integer> intstream=Stream.iterate(2, n->n+1).limit(15);
		intstream.forEach(System.out::println);
		

	}

}
