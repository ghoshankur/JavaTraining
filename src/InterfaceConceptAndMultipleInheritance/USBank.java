package InterfaceConceptAndMultipleInheritance;

public interface USBank {

	int min_bal=100;
	public void credit();
	public void debit();
	public void transferMoney();
	
	// only method declaration
	// no method body
	// We can declare only variables and are static in nature
	// value of variable will not change
	// no static method and main method can be mentioned
	//it's abstract in nature means we can't create an object of it
	
}
