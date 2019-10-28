package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println("Linked list value"+ ll);
		//addFirst addLast
		ll.addFirst("ABC");
		ll.addLast("CDA");
		System.out.println("Linked list value"+ ll);
		
		//get and set
		
		System.out.println("Linked list value "+ ll.get(0));
		ll.set(0,"Hi");
		System.out.println("Linked list value at 0 after setting "+ll.get(0) );
		//removeFirst and removeLast
		ll.removeFirst();
		System.out.println("Linked list value after remove first"+ ll);
		ll.removeLast();
		System.out.println("Linked list value after remove last"+ ll);
		//remove from specific position
		ll.remove(2);
		System.out.println("Linked list value after remove 2nd index"+ ll);
		
		//Iterate linked list
		//for loop
		System.out.println("****Linked list using for loop ");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		//advanced for loop
		System.out.println("****Linked list using advanced for loop");
		for(String str:ll)
		{
			System.out.println("Linked list "+str);
		}
		//iterator
		System.out.println("****Linked list using iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println("Linked list "+it.next());
		}

	}

}
