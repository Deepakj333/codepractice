package com.example.demo;

import java.util.Stack;

public class BalanceBracket {

	
	/*
	 * for balance bracket we use stack 
	 * stack work on LIFO (Last in first out principle) it has methods like push and pop and peak
	 * where push will add data in stack and pop will return last inserted data and delete it
	 * The peek method in a stack is an operation that allows you to view the element at the top of the stack without removing it.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
	 System.out.println(balanceBracket());

		
	}
	
	public static boolean balanceBracket() {
	String input = "{()}";
		
		char [] arr = input.toCharArray();
		
		Stack<Character> s = new Stack<>();
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]=='{'  || arr[i]=='[' || arr[i]=='(') {
				
				s.push(arr[i]);
				
			}
			else {
				
				if(( s.peek() == '{' && arr[i] =='}' ) || ( s.peek() == '[' && arr[i] ==']' ) || ( s.peek() == '(' && arr[i] ==')' )) {
				
				     s.pop();
			    }else {
			    	return false;
			    }
			
			}
			
			
		}
		
		
		return true;
		
	}
	
	
	
	public static boolean rewriteBalanceTree(String input) {
	
		Stack<Character> sc  = new Stack<>();
		
		char [] c = input.toCharArray();
		
		for(int i = 0; i< c.length; i++) {
			
			if(c[i] == '{' || c[i] == '[' || c[i] == '(') {
				
				sc.push(c[i]);	
			}
			else if((sc.peek()=='{' && c[i] =='}') || (sc.peek()=='{' && c[i] =='}')||(sc.peek()=='{' && c[i] =='}')) {
				sc.pop();
			}else {
				return false;
			}
			
		}
	
		return true;
	}
	
	
	
}
