package packages;

import java.util.ArrayList;

public class ArrayListPractice {
	
	
	
	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList(10);
		arrList.add("Jeffrey Huisa");
		arrList.add(25);
		arrList.add(true);
		arrList.add('M');
		arrList.add("We are going to remove this.");
		
		arrList.remove(4);
		
		System.out.println(arrList.get(0));
		
		System.out.println(arrList);
		
		
		System.out.println();
		System.out.println("====================================");
		
		
		for(Object i : arrList) {
			System.out.println(i);
		}
		
		
		System.out.println("====================================");
		System.out.println();
		
		
		System.out.println("Size: " + arrList.size());
		
		
	}
	

	
	


}
