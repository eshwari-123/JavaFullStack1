package com.mystream.exercise;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*#create instances of Employee and store in a list 
        
        #filter the list based on criteria where department="Sales" and designation="Manager"  
        and collect result into seperate list 
        #filter the list based on criterial where department location is
        Mumbai and collect result into seperate list 
        #display the with employee first and last name combined using a
        mapping operation and collect result in separate list 
		*/
		
		ArrayList<Employee> list=new ArrayList();
		list.add(new Employee("john", "duke",new Department("Sales department","Hyderabad"),new Designation("sales department")));
		list.add(new Employee("jack", "dios",new Department("Marketing department","Nizamabad"),new Designation("marketing department")));
		list.add(new Employee("mike", "eros",new Department("Medical department","Delhi"),new Designation("medical department")));
		list.add(new Employee("john", "duke",new Department("fore department","mumbai"),new Designation("sales department")));
		list.add(new Employee("john", "duke",new Department("Sales department","Hyderabad"),new Designation("sales department")));
		
		
		List<Employee> employees=list.stream().filter((e)->e.getDepartment().getDepartmentName().equals("Sales Department")&&e.getDesignation()
.getDesignation_type().equals("Manager")).collect(Collectors.toList());	
		
		List<Employee> employees2=list.stream().filter(e->e.getDepartment().getLocation().equals("mumbai")).collect(Collectors.toList());
		
		List<String> e3=list.stream().collect(Collectors.mapping((Employee e)->e.getFirstName()+" "+e.getLastName(),Collectors.toList()));
		System.out.println(e3);
	}

}
