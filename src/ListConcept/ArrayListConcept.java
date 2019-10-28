package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		//It's Dynamic in nature
		//Can contain duplicate elements/values
		//Maintains insertion order
		//Synchronized 
		//Allows random access to fetch the value/element as it stores the values on the basis of index
		ArrayList ar=new ArrayList();
		
		ar.add(14.5);
		ar.add("Hi");
		ar.add('w');
		ar.add(5);
		System.out.println(ar.size());
		//System.out.println(ar.get(0));
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		//generic Vs. non-generic
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(11);
		/*ArrayList<E> ar2=new ArrayList<E>();
		ar2.add('e',null);
		ar2.add(11, null);*/
		
	//Create object for Employee class
		Employee e1=new Employee(22,"Ankur","QA");
		Employee e2=new Employee(25,"Arun","Dev");
		Employee e3=new Employee(29,"Ravi","Sales");
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		//System.out.println(ar3.get(0)); not possible
		//Iterater to traverse the array list
		Iterator<Employee> it=ar3.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
			
		}
		
		//addAll() to merge ArrayLists
		ArrayList<Integer> ar4=new ArrayList<Integer>();
		ar4.add(11);
		ar4.add(55);
		ar4.add(88);
		ArrayList<Integer> ar5=new ArrayList<Integer>();
		ar5.add(22);
		ar5.add(77);
		ar5.add(99);
		
		ar4.addAll(ar5);
		System.out.println("************************");
		for(int i=0;i<ar4.size();i++)
		{
			System.out.println(ar4.get(i));
		}
		//removeAll() to remove ArrayLists
		ar4.removeAll(ar5);
		System.out.println("************************");
		for(int i=0;i<ar4.size();i++)
		{
			System.out.println(ar4.get(i));
		}
		//retainAll to find the common elements in two list
		ArrayList<Integer> ar7=new ArrayList<Integer>();
		ar7.add(22);
		ar7.add(55);
		
		ar7.retainAll(ar5);
		System.out.println("************************");
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}

	}

}
