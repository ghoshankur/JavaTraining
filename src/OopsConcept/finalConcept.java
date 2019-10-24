package OopsConcept;

public class finalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		 final int i=10;
		  //final is used for constant value and value can not be changed for that variable.
		 //Final you can use to prevent inheritance and method overriding also
		 System.out.println(i);
		 finalConcept fc=new finalConcept();
		 fc.start();
		 testClass tc=new testClass();
		 tc.start();
	}
	
	public void start()
	{ int j=20;
		System.out.println(j);
		
	}

}
