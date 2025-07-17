package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.demo.dto.Employee;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee("1", "om", "27");
		Employee emp2 = new Employee("2", "ravi", "28");
		Employee emp3 = new Employee("3", "panday", "28");
		Employee emp4 = new Employee("3", "deepak", "28");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		
		Comparator<Employee> comem = (e1,e2)->{
			
			return e1.getName().compareTo(e2.getName());
			
		};
//		
//		
//		 Collections.sort(empList,comem);
		
		
		Collections.sort(empList,Comparator.comparing(Employee::getName));
		 
	//	 System.out.println(empList);
		
		
		empList.sort(Comparator.comparing(Employee::getName));
		
		 List <Employee> stremlist =empList.stream().sorted(comem).toList();
		 
		// System.out.println(stremlist);
		
		 List <Employee> stremlist1 =empList.stream().sorted(Comparator.comparing(Employee::getName)).toList();
		 
		 
		 // reverse
		 List <Employee> stremlist2 =empList.stream().sorted(Collections.reverseOrder(comem)).toList();
		 
		 System.out.println(stremlist2);

		
	}

}
