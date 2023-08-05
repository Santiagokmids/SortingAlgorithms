package sorting;

import java.util.Arrays;
import java.util.List;


public class Main {
	
	public static int array[];
	
	public static void bubbleSort(){
		int changes = 1;
		
		for(int i=1;i<array.length && changes > 0;i++) {
			
			for(int j=0;j<array.length-i;j++) {
			
				if(array[j] > array[j+1]) {
					int tem = array[j];
					array[j] = array[j+1];
					array[j+1] = tem;
					changes++;
				}
			}
		}
		System.out.println(Arrays.toString(array));	
	}
	
	/*public static void main(String[] args) {
		array = new int[] {3,1,8,5,9,4,2,6,7};
		System.out.println(Arrays.toString(array));
		
		bubbleSort();
		
	}*/
	
	/*public static void selectionSort() {
		for(int i=0;i<array.length;i++) {
			int min = array[i];
			for(int j = i+1;j < array.length;j++) {
				if(array[j]<min) {
					int temp = array[j];
					array[j] = min;
					min = temp;
				}
			}
			array[i] = min;
		}
		System.out.println(Arrays.toString(array));
	}*/
	
	/*public static void main(String[] args) {
		array = new int[] {3,1,8,5,9,4,2,6,7};
		System.out.println(Arrays.toString(array));
		
		selectionSort();
	}
	
	public static void insertionSort() {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j-1]>array[j]; j--) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;	
			}
		}
	}*/
	
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));
		
		String m = "hora";
		System.out.println("Clientes en el orden de salida \n50141 18560 \n451 487\n95545 86000 \n451 213");
			
		//System.out.println(m.length());
		//array = new int[] {3,1,8,5,9,4,2,6,7};
		//System.out.println(Arrays.toString(array));
		
		//insertionSort();
//		//System.out.println(Arrays.toString(array));
	}
	
public static void addSorted(List<Integer> list, int newValue) {
		
		if(list.isEmpty()) {
			list.add(newValue);
		}
		else {
			
			int i = 0;
			
			while(i < list.size() && list.get(i) < newValue) {
				i++;
			}
			System.out.println(i);
			list.add(i, newValue);
		}
	}

	
}
