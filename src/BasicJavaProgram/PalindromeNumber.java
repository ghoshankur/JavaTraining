package BasicJavaProgram;

public class PalindromeNumber {

	static int r;
	static int var;
	public void palin(int n)
	{
		int temp=n;
	while(n>0){
			r=n%10;
			var=(var*10)+r;
			n=n/10;
	}
		if(var==temp)
			System.out.println(temp+" is Palindrome number");
		else
			System.out.println(temp+" is not plaindrome");
	}
	
	public static void main(String[] args) {
		PalindromeNumber p=new PalindromeNumber();
		p.palin(212);
		p.palin(144);
		
	}

}
