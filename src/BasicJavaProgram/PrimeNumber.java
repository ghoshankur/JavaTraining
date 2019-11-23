package BasicJavaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean IsPrimeNumber(int a) {
		if (a <= 1) {
			return false;
		} else
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		return true;
	}
	public static void getPrime(int a)
	{//print prime number till a range
		for(int i=0;i<=a;i++)
		{
			if(IsPrimeNumber(i))
				System.out.println("Prime number in range of  "+a+ " "+i+"\n");
		}
		
	}

	public static void main(String[] args) {
		// A prime number is only Divisible by 1 and itself
		System.out.println("Enter a number to check prime or not: ");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		PrimeNumber p = new PrimeNumber();
		p.getPrime(a);
		//System.out.println("Is Prime number? " + p.IsPrimeNumber(a));
		

	}

}
