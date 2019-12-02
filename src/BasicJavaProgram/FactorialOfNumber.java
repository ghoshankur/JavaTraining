package BasicJavaProgram;

public class FactorialOfNumber {
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));
		
	}
	public static void main(String[] args) {
	
		System.out.println("Factorial of 5 with recursion is "+fact(5));
		System.out.println("Factorial of 11 "+factorial.fact(11));

	}

}
