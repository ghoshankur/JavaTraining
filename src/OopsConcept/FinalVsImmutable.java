package OopsConcept;

/*final means that you can’t change the object’s reference to point to another reference or another object, 
 but you can still mutate its state (using setter methods e.g).
 Whereas immutable means that the object’s actual value can’t be changed, 
 but you can change its reference to another one.*/
public class FinalVsImmutable {

	public static void main(String[] args) {
		final StringBuffer fi = new StringBuffer("Hello ");
		// Even though reference variable fi is final
		// We can perform any changes
		fi.append("Ankur");
		System.out.println(fi);
		// Here we will get Compile time error
		// Because reassignment is not possible for final variable
		//fi = new StringBuffer("Hello");

		// immutability
		String s1 = "Java";
		String s2 = "Java";
		s2 = "Ankur";
		System.out.println(s1);
		System.out.println(s2);

	}

}
