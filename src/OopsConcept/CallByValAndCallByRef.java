package OopsConcept;

public class CallByValAndCallByRef {
int p;
int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		int x=10;
		int y=20;
	
		System.out.println(obj.sum(x,y));//Call by value
		
		obj.p=50;
		obj.q=25;
		obj.swap(obj);
		System.out.println(obj.p+" "+obj.q);
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	//Call by reference as we are passing the object reference of the object
	public void swap(CallByValAndCallByRef t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
