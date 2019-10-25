package SingletonDesign;

// Singleton is a design pattern where we have only one instance of a class or only one object.
//How to design a singleton class:
//1. Make all constructor as private
//2. write  static method(getInstance) that returns a reference to the instance(Lazy Initialization)
public class SingletonConcept {
	private static SingletonConcept obj;
	String str;

	private SingletonConcept() {
		str = "Hi this is singleton design pattern";
	}

	public static SingletonConcept getInstance() {
		if (obj == null)
			obj = new SingletonConcept();
		return obj;
	}

	public static void main(String[] args) {
		SingletonConcept x = SingletonConcept.getInstance();
		SingletonConcept y = SingletonConcept.getInstance();
		SingletonConcept z = SingletonConcept.getInstance();
		x.str = x.str.toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		z.str=z.str.toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		/*
		 * You can use the below way of executing as well instead of using the
		 * above one where you declare 3 class to prove it refers to one object.
		 */
		//System.out.println(SingletonConcept.getInstance().str.toUpperCase());

	}

}
