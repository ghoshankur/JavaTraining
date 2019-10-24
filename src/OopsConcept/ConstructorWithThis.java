package OopsConcept;

public class ConstructorWithThis {

	//Class Variable
	//This key word is used to initialize the class variable. if you want to use class variable value in any method or constructor you can use this
	String name;
	static int age;
	public ConstructorWithThis(String name,int age){
		this.name=name;
		this.age=age;
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
