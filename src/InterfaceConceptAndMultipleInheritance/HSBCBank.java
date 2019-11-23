package InterfaceConceptAndMultipleInheritance;

public class HSBCBank implements USBank,GermanBank,RBI {
	//It's mandatory to define all the methods in the interface
	//Is a relationship
	int min=100;
	public void credit()
	{
		System.out.println("HSBC Bank Credit");
	}
	public void debit()
	{
		System.out.println("HSBC Bank debit");
	}
	public void transferMoney()
	{
		System.out.println("HSBC Bank money transfer");
	}
	public void carloan()
	{
		System.out.println("HSBC Bank Car loan");
	}
	public void eduloan()
	{
		System.out.println("HSBC Bank education loan");
	}
	public void mutualFund()
	{
		System.out.println("HSBC Bank mutualfund");
	}
	@Override
	public void transferMoneyDB() {
		
		System.out.println("HSBC Bank (Germany) Min Balance "+GermanBank.min_bal+" to transfer money");
	}
	

}
