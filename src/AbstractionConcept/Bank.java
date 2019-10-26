package AbstractionConcept;

//Partial abstraction in this class
//to achieve full abstraction need to hide the implementation logic 
//can not create the object of abstract class
public abstract class Bank {
	public abstract void loan();// no method body and class need to be abstract
								// for abstract method.

	public static void withdraw(int available_amt, int remaining_amt) {
		System.out.println("money witdrawn ");
		System.out.println("remaining amount " + (available_amt - remaining_amt));
	}

	public void debit() {
		System.out.println("Bank----Debit");
	}

	public void credit() {
		System.out.println("Bank----credit");
	}

}
