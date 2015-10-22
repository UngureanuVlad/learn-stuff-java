package ro.learnstuff.main;

import ro.learnstuff.generics.examples.GenericsUpperBoundExample;
import ro.learnstuff.generics.examples.GenericsClassExample;
import ro.learnstuff.generics.examples.GenericsMethodExample;
import ro.learnstuff.generics.examples.GenericsTypeExample;
import ro.learnstuff.generics.examples.NonGenericsExample;

public class GenericsMain {

	public static void main(String[] args) {

		NonGenericsExample nonGenericsExample = new NonGenericsExample();
		nonGenericsExample.ilustrateNonGenericsBehaviour();
		showLine();

		GenericsTypeExample genericsTypeExample = new GenericsTypeExample();
		genericsTypeExample.ilustrateGenericType();
		showLine();

		GenericsMethodExample genericsMethodExample = new GenericsMethodExample();
		genericsMethodExample.ilustrateGenericMethod();
		showLine();

		GenericsClassExample genericsClassExample = new GenericsClassExample();
		genericsClassExample.ilustrateGenericClass();
		showLine();

		GenericsUpperBoundExample genericsUpperBoundExample = new GenericsUpperBoundExample();
		genericsUpperBoundExample.illustrateUpperBounds();
		showLine();
	}

	// helper method
	private static void showLine() {
		System.out.println("=========================================================");
	}
}
