package ro.learnstuff.main;

import ro.learnstuff.examples.ListExamples;
import ro.learnstuff.examples.MapExamples;
import ro.learnstuff.examples.SetExamples;
import ro.learnstuff.examples.TreeExamples;

public class CollectionsMain {

	public static void main(String[] args) {

		ListExamples listExamples= new ListExamples();
		listExamples.ilustrateArrayList();
		listExamples.ilustrateLinkedList();
		showLine();

		MapExamples mapExamples = new MapExamples();
		mapExamples.illustrateMap();
		showLine();

		SetExamples setExamples = new SetExamples();
		setExamples.illustrateSetExample();
		showLine();

		TreeExamples treeExamples = new TreeExamples();
		treeExamples.illustrateTreeSet();
	}

	// helper method
	private static void showLine() {
		System.out.println("=========================================================");
	}
}
