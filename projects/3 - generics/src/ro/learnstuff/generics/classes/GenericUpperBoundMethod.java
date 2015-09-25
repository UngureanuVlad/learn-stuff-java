package ro.learnstuff.generics.classes;

import java.util.List;

public class GenericUpperBoundMethod {

	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    System.out.println(s);
	    return s;
	}
}
