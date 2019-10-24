package OopsConcept;

public class LocalVsGlobalVariable {
 
	String n="Ankur";int age=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=22;
		System.out.println(i);
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
		System.out.println(obj.n);
		System.out.println(obj.age);
		obj.pqr();
	}
	
	public void pqr()
	{
		int i=11;
		int j=22;
		int age=32;
		System.out.println(n+" is "+i+j);
	}

}
