package com.mystream;

import java.awt.geom.Ellipse2D;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DeviceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		List<Integer> nIntegers=Arrays.asList(12,34,56,78,97);
		Stream<Integer> iStream=nIntegers.stream();
		System.out.println(iStream.reduce(0,(e1,e2)->e1+e2/5));**/
		
		/**ArrayList<Device> list=new ArrayList();
		list.add(new Device("BSC", "Peter"));
		list.add(new Device("teleprint", "john"));
		list.add(new Device("modem", "anny"));
		list.add(new Device("connector", "samuel"));
		list.add(new Device("Terminal", "erric"));
		
		Stream<Device> stream=list.stream();
		stream.filter((e)->e.getTechnicianName().equals("john")).map((e)->e.toString().toUpperCase()).forEach(System.out::println);
		**/
		
		/**
		List<Integer> nIntegers=Arrays.asList(12,3,5567,78,89);
		Stream<Integer> intstream=nIntegers.stream();
		Integer mynum=intstream.min((a,b)->{
			if(a==b) {
				return 0;
				
			}
			else if(a>b) {
				return 1;
			}
			else {
				return-1;
			}
		}).get();**/
		
		List<Device> list=new ArrayList();
		list.add(new Device("BSC", "Peter",4));
		list.add(new Device("teleprint", "john",6));
		list.add(new Device("modem", "anny",9));
		list.add(new Device("connector", "samuel",3));
		list.add(new Device("Terminal", "erric",5));
		list.stream().sorted().(e1,e2)->e1.getTechnicianName().compareTo(e2.getTechnicianName())
		
		
		
		
		/**Device d1=dev.max((a,b)->{
			if(a.getNo_of_days()==b.getNo_of_days()) {
				return 0;
			}
			else if(a.getNo_of_days()>b.getNo_of_days()) {
				return 1;
			}
			else {
				return -1;
			}
		}).get();**/
		
		
		
	}

}
