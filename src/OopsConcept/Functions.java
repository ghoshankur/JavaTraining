package OopsConcept;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non static Functions
		Functions obj=new Functions();
		System.out.println(obj.pqr());
		
		System.out.println(obj.div(53,2));
		obj.test();
		//System.out.println(obj.div(53,2));
		
	}
		public void test()
		{
			System.out.println("Void method means no return/n");
		}
		
		public int pqr()
		{
			System.out.println("Void method means no return hence make the method as you want to return here we are returning int as c is of int type/n");
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
		}
		
		public float div(float x,float d)
		{
			float a=(float) (x/d);
			return a;
		}

	

}
