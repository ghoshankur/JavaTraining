package OopsConcept;

public class WrapperClassConcept {
	static String x="100";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Can not have non static global variable inside a wrapper class integer.
		System.out.println("x before conversion "+x);
		int j=Integer.parseInt(x)+20;
		System.out.println(" After conversion 20+x "+j);
		
		System.out.println("J after converting to string from int "+String.valueOf(j)+8);
		
		String a="100A";
		Integer.parseInt(a);//As a is not a pure int it will throw number format exception.
	}

}
