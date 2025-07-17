package com.example.demo;

import java.util.stream.Stream;

public class Quiksort {

	public static void main(String[] args) {

		int [] intList  = {5,2,4,3,6};
		
		
		int pivot = intList[0];
		int low = 0;
		int high = intList.length;
		
	
		while (low < high) {
		
			do {
				low ++;
			}while(intList[low]<=pivot);
			
			do {
				high --;
			} while (intList[high] > pivot);
			
			if(low < high ) { 
				
				// swap
				
				int temp = intList[high];
				
				intList[high] =intList[low];
				
				intList[low] = temp;
				
			}
		}
		
		int temp = intList[high];
		
		intList[high] = pivot;
		
		intList[0] = temp;
		
		
		Stream.of(intList).forEach(i-> System.out.println(i));
		
		
	}

}
