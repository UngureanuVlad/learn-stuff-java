package ro.learnstuff.generics.classes;

public class GenericsMethod {

	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
		return g1.get().equals(g2.get());
	}
}
