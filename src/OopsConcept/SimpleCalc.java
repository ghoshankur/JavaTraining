package OopsConcept;

public class SimpleCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalc calc=new SimpleCalc();
		System.out.println(calc.calc(10.05, 3.03));
		System.out.println(calc.calc(55, 2.5));
		System.out.println(calc.calc(11,11));
		
	}

	public int calc(int i,int j){
		int c=i+j;
		return c;
	}
	public double calc(double i,double j)
	{
		double c=i*j;
		return c;
	}
	public double calc(float i, float j)
	{
		float c=i/j;
		return c;
	}
}
