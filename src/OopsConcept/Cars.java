package OopsConcept;

public class Cars {
int mod;
int wheels;
String manu;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define 2 global variable initialize objects.
		
		Cars a=new Cars();
		Cars b=new Cars();
		
		a.mod=2015;
		a.wheels=2;
		a.manu="BMW";
		
		b.mod=2018;
		b.wheels=4;
		b.manu="RR";
		
		System.out.println("Manufacturar :"+a.manu+"\nModel :"+a.mod+"\nwheels :"+a.wheels);
	}

}
