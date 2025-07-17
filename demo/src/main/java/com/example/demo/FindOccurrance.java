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
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOccurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Nth highest salary using stream API in dynamic way
		 */
		
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
		 * if we apply below logic it gets failed
		 * salary2.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList().get(1).getValue();
		   here we have to go for group by logic
		 */
		
		// solution 1
//		int num = 3;
//       List<Entry<String, Integer>> secendHighestSalary2 = salary2.entrySet().stream().
//    		   collect(Collectors.groupingBy(e->e.getValue())).entrySet().
//       stream().sorted(Collections.reverseOrder(Entry.comparingByKey()))
//       .map(e->e.getValue()).toList().get(num-1);
//    		   
//		System.out.println(secendHighestSalary2);
		
		// solution 2
		
		int num = 3;
      Entry<Integer, List<String>> secendHighestalary2 = salary2.entrySet().stream().
   		   collect(Collectors.groupingBy(e->e.getValue() , Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).
   		   entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).toList().get(num-1);
   		   
		

		
		
		/*
		 * 2th highest salary using stream API
		 */
		
		Map<String , Integer> salary = new HashMap<>();
		salary.put("ravi", 16000);
		salary.put("om", 17000);
		salary.put("rk", 32000);
		salary.put("avaya", 28000);
		salary.put("panday", 9000);
		
		
		
		int secendHighestSalary = salary.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList().get(1).getValue();
		
		System.out.println(secendHighestSalary);
		
		
		String s = "ilovejavatechie";
		
		String [] result =s.split("");
		
		/*
		 * find ocuurance of each character
		 *  instant of using a->a we can use Function.identity()
		 */
		

		Map<String, Long> ocuurance=Arrays.stream(result).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(ocuurance);
		
		/*
		 * find duplicate character from string
		 * 
		 */
			
		List<String> duplicatechar = Arrays.stream(result).collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream().
				filter(e-> e.getValue()>1).map(x->x.getKey()).toList();
		
		System.out.println(duplicatechar);
		
		
		/*
		 * find unique element from string
		 */

		List<String> uniquechar = Arrays.stream(result).collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream().
				filter(e-> e.getValue()==1).map(Map.Entry::getKey).toList();
		
		System.out.println(uniquechar);
		
		/*
		 * find first non repeat element
		 */
				
		String nonRepeat =Arrays.stream(result).collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting())).entrySet().stream().
		filter(e-> e.getValue()==1).findFirst().get().getKey();
		
		System.out.println(nonRepeat);
		
		
		/*
		 * find second highest number from array
		 */
		
		int[] number = {5,9,11,2,8,21,1};
		
		Integer findSecondHighest =Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(findSecondHighest);
		
		/*
		 * find longest string from given array
		 */
		
		String [] strArray = {"java","techie","springboot","microservices"};
		
		String longestString =Arrays.stream(strArray).reduce((word1,word2)-> word1.length()>word2.length()?word1:word2).get();

		System.out.println(longestString);
		
		/*
		 * find element in array who is start with element 1
		 */
		
		List<String> strArray2 =Arrays.stream(number).boxed().map(e1->e1+"").filter(e2->e2.startsWith("1")).toList();
		
		System.out.println(strArray2);
		
		/*
		 * String.join method example
		 */
		
		List<String> nos =Arrays.asList("1","2","3","4");
		
	    String result2 =String.join("-", nos);
	    
	    System.out.println(result2);
	    
	    /*skip and limit example
	     * 
	     */
	    
	    IntStream.rangeClosed(1, 9).skip(1).limit(8).forEach(System.out::print);
	    
	    /*
	     * try sort list and map
	     */
	    
	    /*
	     * Applying a Mapping Function for Aggregation
	     */
	    
	    List<City> cities = Arrays.asList(
	            new City("Tarron", 12000),
	            new City("Edessa", 800000),
	            new City("Velun", 450000),
	            new City("Dornath", 1200000),
	            new City("Yhara", 60000)
	        );
	    
	    Map<String, List<String>> citiesBySize = cities.stream().collect(Collectors.groupingBy(city->{
	    	
	    	          if (city.getPopulation()<100000) {
	    	        	  return "Small";
	    	          }else if (city.getPopulation() <= 1000000){
	    	        	  return "Medium";
	    	          }else {
	    	        	  return "Large";
	    	          }
	    	          
	               },
	    		
	    		Collectors.mapping(city->city.getName(), Collectors.toList())
	    		
	    		));
	    
	    System.out.println(citiesBySize);

	}

}

