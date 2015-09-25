package ro.learnstuff.generics.examples;

import ro.learnstuff.generics.classes.GenericsType;

public class GenericsTypeExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void ilustrateGenericType(){
		GenericsType<String> type = new GenericsType<>();
        type.set("test");
        // not working - type safe to String
        // type.set(10);
        
        System.out.println(type.get());
        
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("test"); //valid
        type1.set(10); //valid and autoboxing support
	}
}
