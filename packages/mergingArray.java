package packages;

import java.util.Arrays;

public class mergingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {
				1,2,3,4
		};
		
		
		int[] array2 = {
				5,6
		};
		
		int[] array3 = new int[array1.length + array2.length];
		
		int count = 0;
		
		
		for(int i = 0; i < array1.length; i++) { 
			array3[i] = array1[i];
	         count++;
	      } 
		
		 for(int j = 0; j < array2.length;j++) { 
			 array3[count++] = array2[j];
	      }
		
		
		
		System.out.println( Arrays.toString(array3));
	}

}
