package com.mystream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<List<Integer>> supplier=ArrayList::new;
		IntStream.range(0, 10);
		ObjIntConsumer<List<Integer>> accumulator=Collection::add;
		BiConsumer<List<Integer>,List<Integer>> combiner=Collection::addAll;
		List<Integer> collect=IntStream.range(0, 10).collect(supplier, accumulator, combiner);
	System.out.println(collect);
	
	}

}
