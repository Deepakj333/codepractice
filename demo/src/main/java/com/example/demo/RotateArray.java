package com.example.demo;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] intList  = {5,2,4,3,6};
		
		  
		   
		   int p = 1;
		   
		   while(p<=2) {
			   
			   int temp =intList[0];
		
		   for(int i = 0 ;i<intList.length-1;i++) {
			   
			   intList[i] = intList[i+1];
		   }
		   
		   intList[intList.length-1] = temp;
		   
		   p++;
		 }

		   System.out.println(Arrays.toString(intList));
	}

}
