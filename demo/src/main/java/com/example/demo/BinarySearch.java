package com.example.demo;

public class BinarySearch {

	public static void main(String[] args) {

		int [] intList  = {1,2,3,4};
		
		System.out.println(search(intList));
		
	}
	
	
	public static int search(int [] intList) {
		
		
       int high = intList.length;
		
		int low =0;
				
		int input = 4;
		
		while (low < high ) {
						
			int middle = (low + high)/2;

			if(intList[middle] == input ) {
				 return middle;
			}
			
			else if (intList[middle] < input)
			{
				low = middle+1;
			
			}else {
				
				high = middle-1;
				
			}
			
			
			
		}
		
		return -1;
		
	}
	
	public static int rewriteSearch(int [] a) {
		
		int high = a.length;
		
		int low = 0;
		
		int input = 9;
		
		while (low <high) {
			
			int middle = (low + high)/2;
			
			if(a[middle] == input ) {
				
				return middle;
				
			}else if(a[middle]<input) {
				
				low = middle+1;	
				
			}else {
				high = middle-1;
			}
			
		}
				
						
		
		return -1;
	}

}
