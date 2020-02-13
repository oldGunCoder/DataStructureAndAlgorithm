package tasks;

public class Homework3 {

	/*1-
	Count recursively the total number 
	of "abc" and "aba" substrings 
	that appear in the given string.*/
	public int countSubstring (String str) {
		//exit condition
		if (str.length() < 3) {
			return 0;
		}
		
		//check the count
		if(str.substring(0, 3).equals("abc")) {
			return 1 + countSubstring(str.substring(3));
		} else if (str.subSequence(0, 3).equals("aba")) {
			return 1 + countSubstring(str.substring(3));
		}
		
		//if it wasn't abc or aba, we removed the first character
		return countSubstring(str.substring(1));
	}
	
	/*2-
	Given a string, compute recursively (no loops) 
	the number of "11" substrings in the string. 
	The "11" substrings should not overlap.*/
	public int countElevens(String str) {
		//exit condition
		if (str.length() < 2) {
			return 0;
		}
		
		//check the count
		if(str.substring(0, 2).equals("11")) {
			return 1 + countElevens(str.substring(2));
		} 
		
		//if it wasn't 11, we removed the first character
		return countElevens(str.substring(1));
	}
	
	/*3-
	Given an array of ints, is it possible to 
	divide the ints into two groups, so that the 
	sums of the two groups are the same. 
	Every int must be in one group or the other. 
	Write a recursive helper method that takes whatever
 	arguments you like, and make the initial call to your 
	recursive helper from splitArray(). (No loops needed.)

	splitArray([2, 2]) ? true
	splitArray([2, 3]) ? false
	splitArray([5, 2, 3]) ? true*/
	
	public boolean splitArray(int[] arr) {
		
		return true;
	}
}
