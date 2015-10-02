package ro.learnstuff.main;

import ro.learnstuff.examples.ListExamples;
import ro.learnstuff.examples.MapExamples;
import ro.learnstuff.examples.SetExamples;
import ro.learnstuff.examples.TreeExamples;

public class CollectionsMain {

	public static void main(String[] args) {

		ListExamples.ilustrateArrayList();
		ListExamples.ilustrateLinkedList();
		showLine();

		MapExamples.illustrateMap();
		showLine();

		SetExamples.illustrateSetExample();
		showLine();

		TreeExamples.illustrateTreeSet();
	}

	// helper method
	private static void showLine() {
		System.out.println("=========================================================");
	}
}
