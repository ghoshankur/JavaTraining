package AbstractionConcept;

public class sbi extends Bank {
	static int interest = 8;
	static int min_amt = 1000;
	int withdraw_amt;
	int available_amt;

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("SBI Loan interest " + interest + "%");
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
