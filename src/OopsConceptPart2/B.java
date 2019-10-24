package OopsConceptPart2;

public class B extends A {
	// public B(){
	// super();
	// System.out.print("Child Class Constructor");
	// }
	public B() {
		super(10);
		System.out.print("Child Class Constructor");
	}

	public static void main(String[] args) {
		B obj = new B();
		// B obj1=new B(10);
	}

}
