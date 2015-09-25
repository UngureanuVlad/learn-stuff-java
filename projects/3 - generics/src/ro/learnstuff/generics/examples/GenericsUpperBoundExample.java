package ro.learnstuff.generics.examples;

import java.util.ArrayList;
import java.util.List;

import ro.learnstuff.generics.classes.GenericUpperBoundMethod;

public class GenericsUpperBoundExample {

	public static void illustrateUpperBounds(){
		List<String> stringList = new ArrayList<>();
		List<Integer> integerList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		
		stringList.add("a String");
		integerList.add(new Integer(10));
		doubleList.add(new Double(10.10));
		
		GenericUpperBoundMethod.sumOfList(integerList);
		
		GenericUpperBoundMethod.sumOfList(doubleList);
		
		// type safe to subclass of Number
		// GenericUpperBoundMethod.sumOfList(stringList);
		
	}
}
