package OopsConcept;

public class ConstructorConcept {

	public ConstructorConcept(){
		System.out.println("Default Constructor");
		
	}
	public ConstructorConcept(String s){
		System.out.println("Passing single parameter in Constructor "+s);
		
	}public ConstructorConcept(int i,String s){
		System.out.println("Passing multiple parameter in Constructor "+i+" "+s);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept("Hello");
		ConstructorConcept obj2=new ConstructorConcept(10,"Hi");

	}

}
