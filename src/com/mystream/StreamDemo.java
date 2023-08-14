package com.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one way of creating the stream
		List<String> collection=Arrays.asList("connector","bsc","Terminal","modules");
		Stream<String> stream=collection.stream();
		System.out.println(collection);
		stream.forEach(System.out::println);
		
		//create a stream from specified values
		Stream<String> stream2=Stream.of("connector","bsc","Terminal","modules");
		
		//create a stream from array of values
		String[] arr= {"connector","bsc","Terminal","modules"};
		Stream<String> stream3=Arrays.stream(arr);
		
		//create a stream using stream class functions
		String[] arr1= {"connector","bsc","Terminal","modules"};
		Stream<String> stream4=Stream.of(arr1);
		Stream<String> empty=Stream.empty();
		
		//Stream builder class
		Stream.Builder<String> builder=Stream.builder();
		builder.add("Modem");
		builder.add("Terminal");
		builder.add("Teleprinter");
		builder.add("Connector");
		Stream<String> stream5=builder.build();
		
		//using an iterate method
		Stream<Integer> intstream=Stream.iterate(1, n->n+2).limit(15);
		intstream.forEach(System.out::println);
		
		//IntStream
		IntStream intStream2=IntStream.of(10,12,13,56,89);
		intStream2.forEach(System.out::println);
		
		//IntStream1
		IntStream intStream3=IntStream.range(1, 5);
		intStream3.forEach(System.out::println);
		IntStream closeStream=IntStream.rangeClosed(1, 5);
		closeStream.forEach(System.out::println);
		
		
		//Double stream
		DoubleStream doubleStream=DoubleStream.of(12,23,45,6,789);
		
		//Stream generates infinite values using generate-> so give limit
		Stream<String> stream6=Stream.generate(()->"Hello world").limit(10);
		stream.forEach(System.out::println);
		
		
		Stream<Integer> stream7=Stream.generate(()->new Random().nextInt()).limit(10);
		
		IntStream stream8=IntStream.generate(()->new Random().nextInt(10)).limit(10);
		
		//Stream all match
		Stream<Integer> stream9=Stream.of(12,23,45,78,90);
		System.out.println(stream9.allMatch(e->e%2==0));
		
		
	}

}
