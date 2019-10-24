package InterfaceConceptAndMultipleInheritance;

public class testBank {

	public static void main(String[] args) {
	System.out.println("HSBC Bank(US) Min Balance "+USBank.min_bal);
	HSBCBank b=new HSBCBank();
	b.carloan();
	b.credit();
	b.debit();
	b.eduloan();
	b.transferMoney();
	b.mutualFund();
	System.out.println("HSBC Bank (Germany) Min Balance "+GermanBank.min_bal);
	//Dynamic polymorphism
	//Child class object can be referenced by parent interface reference variable
     USBank b1= new HSBCBank();
     b1.credit();
     b1.transferMoney();
     
     GermanBank DB= new HSBCBank();
     DB.mutualFund();
     DB.transferMoneyDB();
	}

}
