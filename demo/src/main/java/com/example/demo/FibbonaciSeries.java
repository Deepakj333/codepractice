package com.example.demo;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibbonaciSeries(10);
		

	}

	public static void fibbonaciSeries(int N) {
		
		int a = 0;
		int b = 1;
		
		for(int i =0 ;i<N; i++) {
			
			System.out.print(a+" ");
			
			int c = a+b;
			
			a = b;
			b = c;
					
			
		}
		
		
			  
		
		
	}
	

	public static int fibbonaciSeriesRecurtion(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		int fab1 = fibbonaciSeriesRecurtion(n-1);
		int fab2 = fibbonaciSeriesRecurtion(n-2);
		
		int result = fab1 + fab2;
		
		return result;
		
	}
	

	

}
