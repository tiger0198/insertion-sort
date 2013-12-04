package il.co.mobileapptec.algo.sort;

public class InsertionSort {

	public int[] sort(int[] array){
		
		if (array == null || array.length <2)
		{
			return array;
		}
		
		for (int j=2;j<array.length;j++){
			int key = array[j];
			int i = j-1;
			while(i>=0 && array[i]>key)
			{
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key; 
		}
		return array;
	}
	

}
