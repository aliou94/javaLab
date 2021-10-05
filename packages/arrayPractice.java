package packages;

import java.util.Arrays;
import java.util.List;

public class arrayPractice {
	
//	Display the average of a given integer array 
	
	static void detAverage() {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int result = numbers.stream().reduce(0, (a,b) -> a + b);
		
		
		System.out.println(result/numbers.size());
	}
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declares an array of integers
	
		
		detAverage();
		
		

}}
