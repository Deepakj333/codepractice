package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getDate(null));

		//("wholesale_internal_apportionment20250612072058.csv".toLowerCase().contains("apportionment")
		
	}
	
	 public static String getDate(String date) {
		 
		 
		 /*
		  * find occurance
		  */
	
		 String d = "deeppak";
		 
		String [] a = d.split("");
		
		Map<String, Long> result =Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
		
		/*
		 * find duplicate
		 */
		
		List <String > duplicate=Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
		
		 System.out.println(duplicate);
		 
		 /*
		  * find unique element from string
	     */
		 
		 List <String > unique =Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->!(e.getValue()>1)).map(m->m.getKey()).collect(Collectors.toList());
		 System.out.println(unique);
		 
		 /*
		  * find first non repeat element
	     */
		 
		String firstNon = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().get();

		 System.out.println(firstNon);
		 
		 /*
			 * find second highest number from array
			 */
		 
		  int[] number = {5,9,11,2,8,21,1};
		  
		 int s = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		  System.out.println(s);

		
		  /*
			 * find longest string from given array
			 */
			
			String [] strArray = {"java","techie","springboot","microservices"};
			
			String l =Arrays.stream(strArray).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		
			System.out.println(l);
			

			List<String> st=Arrays.stream(number).boxed().map(e-> e+"").filter(a1->a1.startsWith("1")).collect(Collectors.toList());
			
			System.out.println(st);
			
			Map<String , Integer> salary2 = new HashMap<>();
			salary2.put("ravi", 16000);
			salary2.put("kambli", 16000);
			salary2.put("om", 1700);
			salary2.put("rk", 1700);
			salary2.put("avaya", 1700);
			salary2.put("panday", 900);
			salary2.put("dj", 900);
			salary2.put("shanky", 800);
			salary2.put("manoj", 800);
			
			/*
			 * Nth highest salary
			 */
			
			int n =1;
			
			 Entry<Integer, List<String>> high= salary2.entrySet().stream().collect(Collectors.groupingBy(sal->sal.getValue(),Collectors.mapping(sal->sal.getKey(), Collectors.toList()))).entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).toList().get(n-1);
			
			System.out.println(high);
			
			return null;
		 
		 
		 
	    }

}
