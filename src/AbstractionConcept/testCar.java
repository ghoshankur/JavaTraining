package AbstractionConcept;

public class testCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stop();
		b.theftSafty();
		System.out.println("-------------------------------------------");
		Audi a=new Audi();
		a.start();
		a.stop();

	}

}
