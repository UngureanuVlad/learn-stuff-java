package ro.learnstuff.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ro.learnstuff.model.Student;

public class ListExamples {

	public static void ilustrateArrayList() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("One");
		stringList.add(0, "Zero");
		stringList.add("Two");

		// display list
		interateThroughStringList(stringList);

		// index based changes
		stringList.set(0, "Really Zero");
		// display changed list
		interateThroughStringList(stringList);

		// sort list
		Collections.sort(stringList);
		// display sorted list
		interateThroughStringList(stringList);
	}
	
	public static void ilustrateLinkedList(){
		List<Student> studentList = new LinkedList<>();
		studentList.add(new Student("Ungureanu", "Vlad", 5));
		studentList.add(new Student("POpescu", "Ion", 3));
		
		// display sorted list
		interateThroughStudentList(studentList);
		
		// sort
		Collections.sort(studentList);
		// display sorted list
		interateThroughStudentList(studentList);
	}

	private static void interateThroughStringList(List<String> stringList) {
		for (String string : stringList) {
			System.out.println(string);
		}
	}
	
	private static void interateThroughStudentList(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
