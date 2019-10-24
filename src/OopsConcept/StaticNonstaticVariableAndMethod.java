package OopsConcept;

public class StaticNonstaticVariableAndMethod {

 int s=10;
 static int su=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Static methods cannot be overridden because they are not dispatched on the object instance at runtime. 
		The compiler decides which method gets called.
		Static methods can be overloaded (meaning that you can have the same method name for several methods as long as they have different parameter types).*/
				
		//Non static method call
		StaticNonstaticVariableAndMethod obj=new StaticNonstaticVariableAndMethod();
		System.out.println("Sum of 10+22+11 is "+obj.sum(22));
		//Static method call with a return parameter of int type.
				System.out.println(sum());
		//can not use System.out.println in the below function call as the method is void.
				StaticNonstaticVariableAndMethod.sum(10,33);
		
	}
	public int sum(int i)
	{
		int j=11;
		return (s=s+j+i+su);
		
	}
public static int sum()
{   System.out.println("This is a static method. it can be called directly by method name or class name.method name, no need to creat object to call static method");
//Can not use non static global variable inside static method.	
return (su=su+1);
}
public static void sum(int i,int j)
{int c=i+j;
	System.out.println("C= "+c);
}
}
