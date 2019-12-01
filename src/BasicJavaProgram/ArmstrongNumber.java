package BasicJavaProgram;

public class ArmstrongNumber {
	
	public static void isArmStrong(int n)
	{
		int temp=n;
		int r=0;
		int cube=0;
		while(n>0)
		{
			r=n%10;
			cube+=(r*r*r);
			System.out.println("addition of cube "+cube);
			n=n/10;
		}
		if(temp==cube)
			System.out.println(temp+" is Armstrong Number");
		else
			System.out.println(temp+" is not an Armstrong Number");
	}

	public static void main(String[] args) {
		// addition of cube of each digit is equal to the number
		isArmStrong(153);
		isArmStrong(370);
		isArmStrong(1);
		isArmStrong(448);

	}

}
