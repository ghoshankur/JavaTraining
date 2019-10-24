package OopsConcept;

public class finallyConcept {

	public static void main(String[] args) {
		finallyConcept.test();
	
	}
	public static void test()
	{
		try{
			System.out.println("inside try block method 1");
			throw new RuntimeException("throw exception");
		}
		catch(Exception e)
		{
			System.out.println("inside Catch block method 1 "+e);
		}
		finally{
			//finally will execute only after try and catch is executed irrespective of the result.
			System.out.println("inside finally block method 1");
		}
	}

}
