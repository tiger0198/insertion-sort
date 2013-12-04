package il.co.mobileapptec.algo.sort;

public class Main {

	
	public static void main(String[] args) {
		//init array
		int[] array = new int[5];
		
		array[0] = 10;
		array[1] = 14;
		array[2] = 12;
		array[3] = 9;
		array[4] = 3;
		
		//print array
		printArray(array);
		//sort array
		new InsertionSort().sort(array);
		//print sort array
		printArray(array);
		
	}
	private static void printArray(int[] arr)
	{
		
		for (Object object : arr) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

}
