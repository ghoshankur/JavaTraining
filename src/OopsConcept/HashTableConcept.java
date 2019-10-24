package OopsConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h=new Hashtable();
		h.put(1,"Hi");
		h.put("A", 11.5);
		h.put("b", "Hello");
		h.put(2, 22.44);
		System.out.println("Hash Table size "+h.size());
		System.out.println("Hash  "+h.get("A"));
		Hashtable<Integer,Integer> i=new Hashtable<Integer, Integer>();
		i.put(1,11);
		i.put(2,22);
		i.put(0, 55);
		System.out.println("Hash  "+i.get(2));
		

	}

}
