package OopsConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//you can overload main method.
		//You can not create a method inside a method.Same method name and same number of arguments are not allowed.
		MethodOverLoading obj=new MethodOverLoading();
		obj.sum();
		obj.sum(55);
		obj.sum(" Ankur");

	}
public void sum(){
	System.out.println("No parameter");
}
public void sum(int i){
	System.out.println("With 1 parameter "+i);
}
public void sum(String j){
	System.out.println("With string parameter"+j);
}
}

