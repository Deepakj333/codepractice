package com.example.demo;

public class FindingKpair {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,7,9,12};
		 System.out.println(checkPair(a, 3));

	}
	
	public static boolean checkPair(int a[], int k) {
		
		int i = 0;
		int j = a.length-1;
		
		while (i<j) { // if we don't do this it will compare same pair which is useless
			if(a[i]+a[j]==k) {
				return true;
			}
			else if(a[i]+a[j]>k) {
				j--; // moving right will decrase the sum or make it remain
			}else if (a[i]+a[j]<k){
				i++; // moving left will increase the sum or make it remain
			}
		}
		return false;
	}
	
	public static boolean checkPairAgain(int [] a, int c) {
		
		int i = 0;
		int j = a.length-1;
		
		if((a[i]+a[j])==c) {
			return true;
		}else if((a[i]+a[j])>c) {
			j--;
		}else if((a[i]+a[j])<c) {
			i++;
		}
		
		return false;
	}

}
