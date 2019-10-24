package OopsConceptPart2;

public class testCar {

	public static void main(String[] args) {
		//Static or compile time polymorphism( meaning Method overriding)
		BMW b=new BMW();
		b.start();
		b.safty();
		b.stop();
		b.engine();
		System.out.println("________");
		Car c=new Car();
		c.start();
		c.stop();
		c.refule();
		System.out.println("________");
		//top casting but down casting is not allowed.
		Car c1= new BMW();//Dynamic polymorphism or run time polymorphism when creating object of child class using parent class reference.
		c1.start();
		c1.engine();
		

	}

}
