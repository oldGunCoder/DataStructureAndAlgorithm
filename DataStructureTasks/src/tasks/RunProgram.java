package tasks;

public class RunProgram {
	
//	public static void main(String[] args) {
//		Homework1 hw = new Homework1();
//		
//		int[] array1 = new int[] {1,2,3,4,5,6,7,8};
//		int[] array2 = new int[] {0,6,1,5,3,9};
//		int[] array3 = new int[] {0};
//		int[] array4 = new int[] {};
//		
//		System.out.println("array1 meet the conditions? " + hw.isTrue(array1));
//		System.out.println("array2 meet the conditions? " + hw.isTrue(array2));
//		System.out.println("array3 meet the conditions? " + hw.isTrue(array3));
//		System.out.println("array4 meet the conditions? " + hw.isTrue(array4));
//
//	}
	
	public static void main(String[] args) {
		Homework2 hw2 = new Homework2();
		
		int[] array1 = new int[] {};
		int[] array2 = new int[] {1, 2, 3};
		int[] array3 = new int[] {1, 2, 3, 4};
		
		hw2.makeMiddle(array1);
		hw2.makeMiddle(array2);
		hw2.makeMiddle(array3);
		System.out.println("********************************************");
		
		int[] array4 = new int[] {};
		int[] array5 = new int[] {6, 2, 5, 3};
		int[] array6 = new int[] {1,2};
		int[] array7 = new int[] {1};
		
		hw2.fun(array4);
		System.out.println();
		hw2.fun(array5);
		System.out.println();
		hw2.fun(array6);
		System.out.println();
		hw2.fun(array7);
		System.out.println();
		System.out.println("********************************************");


	}
	
}
