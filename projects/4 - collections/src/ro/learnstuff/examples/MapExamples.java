package ro.learnstuff.examples;

import java.util.HashMap;
import java.util.Map;

import ro.learnstuff.model.Student;

public class MapExamples {

	public static void illustrateMap(){
		Map<Integer, Student> map = new HashMap<>();
		
		map.put(new Integer(1), new Student("Ungureanu", "Vlad", 1));
		map.put(new Integer(2), new Student("Popescu", "Ion", 1));
		
		System.out.println(map.get(1));
		
		// key not found - will return null
		System.out.println(map.get("1"));
		
		// show map
		interateThroughtMap(map);
	}
	
	private static void interateThroughtMap(Map<Integer, Student> map){
		for (Map.Entry<Integer, Student> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + " / " + entry.getValue());
		}
	}
}
