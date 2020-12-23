package OopsConcept;

public class DataTypeConversation {

	public static void main(String[] args) {
		// Convert to String using toString method
		
		int i=-1234;
		double d=22.01;
		String str= Integer.toString(i);
		String str2=Double.toString(d);
	    System.out.println(str+"<-int to string and Double to String using toString()->"+str2);
	   // int a=str;
	   //Convert  double to String using valueOf  method
	    
	    String str3=String.valueOf(d);
	    System.out.println(" Double to String using ValueOf() " +str3);
	  //Convert String to double
	    double d1=Double.valueOf(str);
	    System.out.println("String to Double using valueOf() "+d1);
	    d1=Double.valueOf(i);
	    System.out.println("String to Double using valueOf()  "+d1);
	  //Convert double to int
	    int i1=(int)d1;
	    System.out.println("Double to Integer "+i1);
	  //Variables are case sensitive 
	  //int I;
	  // double i;
	  //From smaller data type integer to bigger data type Double will convert automatically, 
	  // but  from double to Integer it will not convert automatically as integer is having less memory value  
	   

	    
	    
	}

}
