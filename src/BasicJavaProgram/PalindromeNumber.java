package BasicJavaProgram;

public class PalindromeNumber {

	static int r=0;
	static int var=0;
	public void palin(int n)
	{
		int temp=n;
	while(n>0){
			r=n%10;
			var=(var*10)+r;
			n=n/10;
	}
		if(var==temp)
			System.out.println("Palindrome number");
		else
			System.out.println("not plaindrome");
	}
	
	public static void main(String[] args) {
		PalindromeNumber p=new PalindromeNumber();
		p.palin(21);
		
	}

}
