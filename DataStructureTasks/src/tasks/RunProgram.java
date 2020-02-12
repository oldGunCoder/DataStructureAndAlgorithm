package tasks;

public class RunProgram {
	
	public static void main(String[] args) {
		Homework1 hw = new Homework1();
		
		int[] array1 = new int[] {1,2,3,4,5,6,7,8};
		int[] array2 = new int[] {0,6,1,5,3,0};
		int[] array3 = new int[] {0};
		int[] array4 = new int[] {};
		
		System.out.println("array1 meet the conditions? " + hw.isTrue(array1));
		System.out.println("array2 meet the conditions? " + hw.isTrue(array2));
		System.out.println("array3 meet the conditions? " + hw.isTrue(array3));
		System.out.println("array4 meet the conditions? " + hw.isTrue(array4));

	}
}
