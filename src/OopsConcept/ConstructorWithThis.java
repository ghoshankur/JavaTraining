package OopsConcept;

public class ConstructorWithThis {

	//Class Variable
	//This key word is used to initialize the class variable. if you want to use class variable value in any method or constructor you can use this
	//To initialize class property we use this which is a method or variable. Static will not be part of this.
	String name;
	int age;
	
	public ConstructorWithThis(String i,int a){
		this.name=i;//if you are passing different local variable name to initialize global variable you need not to use this keyword. Here it's used just to differentiate the this key word is used only if global and local variable name are same and you want to initialize the global variable with the local variable 
		this.age=a;
		System.out.println(name);
		System.out.println(age);
	}
	public int func(int age,int currentYear){
		int DOB=currentYear-age;
		return DOB;
	}
	public static void main(String[] args) {
		ConstructorWithThis obj=new ConstructorWithThis("Tom",30);
		System.out.println(obj.name);
		System.out.println(obj.func(32, 2019));
	
	}
}
