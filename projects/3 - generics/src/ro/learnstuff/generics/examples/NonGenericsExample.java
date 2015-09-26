package ro.learnstuff.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class NonGenericsExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void ilustrateNonGenericsBehaviour(){
		List rawList = new ArrayList();
		rawList.add(new Integer(10));
		rawList.add("a String"); // ok
		
		// not working - requires cast
		// Integer integerValue = rawList.get(0);
		Integer integerValue = (Integer) rawList.get(0);
		System.out.println(integerValue);

		// not working - list is of raw type; only Object is applicable
		// for (Integer value : rawList){
		for (Object value : rawList){
			if (value.getClass().equals(java.lang.Integer.class)){
				System.out.println("An integer: " + value);
			} else {
				System.out.println("Not an integer: " + value);
			}
			
		}
	}
}
