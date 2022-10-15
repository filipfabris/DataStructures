package hr.fer.oprpp1.custom.collections.demo;


import java.util.Arrays;

import hr.fer.oprpp1.custom.collections.ArrayIndexedCollection;
import hr.fer.oprpp1.custom.collections.LinkedListIndexedCollection;

public class Testing {
	
	public static void main(String[] args) {
		
		ArrayIndexedCollection arrayTwoElements;
		arrayTwoElements = new ArrayIndexedCollection();
		arrayTwoElements.add(1);
		arrayTwoElements.add(2);
		
		
		ArrayIndexedCollection defaultArray = new ArrayIndexedCollection(arrayTwoElements);
		defaultArray.add("Auto");
		defaultArray.add("Tenk");
		defaultArray.add(Integer.valueOf(199));
		defaultArray.add("Los Angeles");
		
		defaultArray.contains(199);
		
		defaultArray.remove("Tenk");
		
		System.out.println(Arrays.toString(defaultArray.toArray()));
		
		System.out.println(Arrays.toString(new Object[]{1, 2, 3, "Auto", "Tenk", 199, "Los Angeles"}));
		
		
		LinkedListIndexedCollection array1 = new LinkedListIndexedCollection();
		array1.add("ZZZ");
		array1.add(3);
		array1.add('h');
		
		LinkedListIndexedCollection array2 = new LinkedListIndexedCollection();
		array2.add("ZZZ");
		array2.add(Integer.valueOf(3));
		array2.add(Character.valueOf('h'));
		
		boolean variable = array1.equals(array2);
		System.out.println(variable);
		
	}

}
