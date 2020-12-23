package BasicJavaProgram;

import java.util.LinkedList;

public class GivenKeyRemoveInLinkedList {
	public static int pos;
	
	public static void deleteKey()
	{
		
	}

	public static void main(String[] args) {
		// Delete all occurrences of a given key in a linked list
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(11);
		ll.add(2);
		ll.add(5);
		ll.add(7);
		ll.add(5);
		ll.add(22);
		
		System.out.println("Linked List is "+ll);
		
		deleteKey();

	}

}
