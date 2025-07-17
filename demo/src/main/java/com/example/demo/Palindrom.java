package com.example.demo;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(isPalendrom("abbi"));
		
		
		

	}

	
	public static boolean isPalendrom(String palin) {
		
      int left = 0;
		
		
		char [] p = palin.toCharArray();
		
		int right = p.length-1;
		
		while (left<right) {
			
			if(p[left] != p[right]) {
				
				return false;
				
			}
			
			left ++;
			right --;
			
		}
		
		return true;
	}
	
}
