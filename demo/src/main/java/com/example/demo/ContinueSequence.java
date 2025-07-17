package com.example.demo;

public class ContinueSequence {

	public static void main(String[] args) {

		int inputArr[] = {1, 2,3,5,9, 6, 7 ,8 ,4, -5, -7 ,-3, -2,-1};
		
		for(int i =0 ;i<inputArr.length;i++) {
			
			StringBuffer result = new StringBuffer("");
			
			for(int j=i+1;j<inputArr.length;j++) {
				
				  int next = inputArr[i]+1;
				  
				  if(next == inputArr[j] ) {
					  
					  if(result.toString().isEmpty())
							result.append(inputArr[i]+"::"+inputArr[j]);
						else
							result.append("::"+inputArr[j]);
						i=j;
						
				  }else {
					  break;
				  }
				
			}
			
			if(!result.isEmpty()) {
				System.out.println(result.toString());
			}
			
		}
		
		
		

	}
	
	public static String rewriteSequence(int a []) {
		int inputArr[] = {1, 2,3,5,9, 6, 7 ,8 ,4, -5, -7 ,-3, -2,-1};

		
		for(int i = 0;i<a.length;i++) {
			StringBuffer sf = new StringBuffer();
			for (int j = i+1 ; j <a.length; j++) {		
				  int next = a[i]+1;
				  if(a[j]==next) {					  
					  if(sf.isEmpty()) {
						  sf.append( a[i]+"::"+a[j]);
					  }else {
						  sf.append("::"+a[j]);
					  }
					  i=j;
				  }else {
					  break;
				  }
				
			}
		}
		
		
		return null;
	}
	

}
