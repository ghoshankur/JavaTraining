package OopsConcept;
import java.io.Serializable;
import java.util.*;
public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Hi");
		ar.add('e');
		//System.out.println("array list size "+ar.size());
		ar.add(45.45);
		System.out.println("array list size "+ar.size());
		ar.get(2);
		ar.remove(2);
		System.out.println("array list size after remove "+ar.size());
		//System.out.println("array value in index 1 is  "+ar.get(1));
		//to print all the value in array list use for loop.
		for(int i=0;i<ar.size();i++)
		{
			System.out.println("array value in index "+i+" is  "+ar.get(i));
		}
		//to have only int valy need to specify data type for arraylist
		ArrayList<Integer> ar1=new ArrayList();
		ar1.add(null);
		ar1.add(11);
		System.out.println("array value in index 1 is  "+ar1.get(1));
		

	}

}
