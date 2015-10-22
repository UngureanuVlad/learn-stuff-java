package ro.learnstuff.examples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeExamples {
	public void illustrateTreeSet(){
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(34);
		tree.add(45);

		Iterator<Integer> iterator = tree.iterator();
	 
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
