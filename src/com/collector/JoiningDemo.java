package com.collector;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"BSC","modem","connector","terminal","terminal"};
			
		
		String m=Stream.of(arr).map((e)->e.toUpperCase()).collect(Collectors.joining(","));
		
	
		System.out.println(m);
	}

	}


