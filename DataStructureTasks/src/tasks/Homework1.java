package tasks;

public class Homework1 {
	
	/*Given an array of integers, return true if the array is length 1 or more, 
	and the first element and the last element are equal. */
	//int i;
	//int[] arr = new int[i];	
	public boolean isTrue(int[] arr) {
		if (arr.length == 0) {
			return false;
		} else if (arr[0]==arr[arr.length-1]) {
			return true; 
		} 
		return false;
	}

}
