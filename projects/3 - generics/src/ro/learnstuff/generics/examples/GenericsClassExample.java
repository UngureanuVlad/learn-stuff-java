package ro.learnstuff.generics.examples;

import ro.learnstuff.generics.classes.GenericsClass;

public class GenericsClassExample {

	public void ilustrateGenericClass() {
		GenericsClass<String, Integer> sample = new GenericsClass<String, Integer>("JAVA2NOVICE", 100);
		sample.printTypes();
	}
}
