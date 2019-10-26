package AbstractionConcept;

public class HDFC extends Bank {
	static int interest = 11;
	static int min_amt = 5000;
	int withdraw_amt;
	int available_amt;

	@Override
	public void loan() {
		if (available_amt < min_amt)
			System.out.println("your available amount is less than min amount hence can not take loan");
		else
		System.out.println("HDFC Loan interest " + interest + "%");

	}

	public void debit(int avail_amt, int rem_amt) {
		this.available_amt = avail_amt;
		this.withdraw_amt = rem_amt;

		if (min_amt > rem_amt) {
			System.out.println("Can not witdraw money");
		} else
			Bank.withdraw(available_amt, withdraw_amt);

	}

}
