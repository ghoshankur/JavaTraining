package AbstractionConcept;

public class testBank {

	public static void main(String[] args) {

		HDFC hb = new HDFC();
		hb.loan();
		hb.debit();
		hb.debit(15000, 7000);
		hb.credit();

		System.out.println("-------------------------------------------");
		sbi sb = new sbi();
		sb.loan();
		sb.debit();
		sb.debit(1000, 500);

	}

}
