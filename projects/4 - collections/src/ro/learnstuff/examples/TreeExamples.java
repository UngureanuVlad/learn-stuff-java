package ro.learnstuff.examples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeExamples {
	public static void illustrateTreeSet(){
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(34);
		tree.add(45);

		// here it test it's sorted, 63 is the last element. see output below
		Iterator<Integer> iterator = tree.iterator();
	 
		// Displaying the Tree set data
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
