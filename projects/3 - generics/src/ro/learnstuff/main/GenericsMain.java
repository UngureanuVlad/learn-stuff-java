package ro.learnstuff.main;

import ro.learnstuff.generics.examples.GenericsUpperBoundExample;
import ro.learnstuff.generics.examples.GenericsClassExample;
import ro.learnstuff.generics.examples.GenericsMethodExample;
import ro.learnstuff.generics.examples.GenericsTypeExample;
import ro.learnstuff.generics.examples.NonGenericsExample;

public class GenericsMain {

	public static void main(String[] args) {

		NonGenericsExample.ilustrateNonGenericsBehaviour();
		showLine();

		GenericsTypeExample.ilustrateGenericType();
		showLine();

		GenericsMethodExample.ilustrateGenericMethod();
		showLine();

		GenericsClassExample.ilustrateGenericClass();
		showLine();

		GenericsUpperBoundExample.illustrateUpperBounds();
		showLine();
	}

	// helper method
	private static void showLine() {
		System.out.println("=========================================================");
	}
}
