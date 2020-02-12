package tasks;

public class Homework2 {

	/*
	Given an array of ints of even length, 
	return a new array length 2 containing the 
	middle two elements from the original array.
	The original array will be length 2 or more.

	makeMiddle([1, 2, 3, 4]) ? [2, 3]
	makeMiddle([7, 1, 2, 3, 4, 9]) ? [2, 3]
	makeMiddle([1, 2]) ? [1, 2]
	*/

	public void makeMiddle(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Array length need to be 2 or more");
		} else if ((arr.length % 2) != 0 ) {
			System.out.println("Array length should be even");
		} else {
			int[] newArr = {arr[(arr.length)/2-1], arr[(arr.length)/2]};
			System.out.println("New array is {" + newArr[0] + ", " + newArr[1] + "}");		
		}
	} 
}
