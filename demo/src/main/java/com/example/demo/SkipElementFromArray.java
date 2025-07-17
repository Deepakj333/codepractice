package com.example.demo;

public class SkipElementFromArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	
//		Output: 1 3
//		Explanation:
//		Take first element: 1
//		Skip second element: 2
//		Take third element: 3
//		Skip fourth element: 4
		
		int [] arr = {1, 2, 3, 4,5,6,7};
		  
		for (int i = 0 ; i<arr.length;i++) {
			
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		
	     }		

	}

}
