package com.batch.demo;

import java.util.HashSet;
import java.util.Set;

public class B {
	
	 public static int lengthOfLongestSubstring(String s) {
	        Set<Character> seen = new HashSet<>();
	        int left = 0, maxLength = 0;
	        
	        for (int right = 0; right < s.length(); right++) {
	            while (seen.contains(s.charAt(right))) {
	            	System.out.println(s.charAt(left));
	                seen.remove(s.charAt(left));
	                left++;
	            }
	            seen.add(s.charAt(right));
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	        
	        return maxLength;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(lengthOfLongestSubstring("bcbbabcbb")); // Output: 3
	        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
	        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
	    }
}
