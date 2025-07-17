package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.demo.dto.Employee;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("1", "om", "27");
		Employee emp2 = new Employee("2", "ravi", "28");
		Employee emp3 = new Employee("2", "ravi", "28");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		List<Employee> disList =empList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("disList " + disList);

		
		String s = "code";
		
		s = "code".replaceAll("\\s", "");;
		
		String [] d =s.split("");
		
		
		Optional<String> result =Arrays.asList(d).stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst();

		System.out.println(result.isEmpty()?null:result.get());
	  

	}

}
