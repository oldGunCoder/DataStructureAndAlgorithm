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
	
	/*
	 * Return an array that is shifted to left by one 
		-- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
		You may modify and return the given array, 
		or return a new array.

		fun([6, 2, 5, 3]) ? [2, 5, 3, 6]
		fun([1, 2]) ? [2, 1]
		fun([1]) ? [1]
	 * */
	public void fun(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array can't be empty");
		} else {
			int temp = arr[0];
			for(int i = 0; i < arr.length-1; i++ ) {
				arr[i] = arr[i+1];
			}
			arr[arr.length - 1] = temp;
			
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			
		}
	}
	
	/*
	 * Given 2 int arrays, a and b, each length 3, 
		return a new array length 2 containing their middle elements.

		middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
		middleWay([7, 7, 7], [3, 8, 0]) ? [7, 8]
		middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]
	 * */
	public void middleWay() {
		
	}
	
}
