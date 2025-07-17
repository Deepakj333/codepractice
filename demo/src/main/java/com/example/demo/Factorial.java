package com.example.demo;

public class Factorial {

	public static void main(String[] args) {


		System.out.println(factorial(4));
		
		System.out.println(itrator(4));
		
	}
	
	
	public static int factorial(int a) {
		
		if(a==0) {
			return 1;
		}
		
		return a * factorial(a-1);
	}
	
	
	public static int itrator(int n) {
		 
		int result =1;
		
	   for(int i = 1; i<=n; i++) {
		   
		   result = result*i;
		   
	   }
	   
	   
	   return result;
		
	}
	
	public static int rewiteFactorial(int n) {
		
		int result = 1;
		
		for(int i =1;i<n;i++) {
			result = result*i;
		}
		
		return result;
	}
	
	public static int rewiteFactorialIerator(int a) {
		
		if(a==0)
			return 1;
		
		return a*rewiteFactorial(a-1);
		
	}

}
