package io.learnstuff.collections.main;

import io.learnstuff.collections.examples.ListExamples;
import io.learnstuff.collections.examples.MapExamples;
import io.learnstuff.collections.examples.SetExamples;
import io.learnstuff.collections.examples.TreeExamples;

public class CollectionsMain {

  public static void main(String[] args) {

    ListExamples listExamples = new ListExamples();
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
