package day45_collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println(ll); // [ ]
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); // [5, 7]
		
		// Linked list'in iki tane interface parent'i vardir
		// Birincisi list, noteki de Deque ==>Queue
		
		ll.add(0, 10); // List interface 'den gelen ozellikle basa eleman ekleme
		System.out.println(ll); // [10, 5, 7]
		
		ll.addFirst(3); // Queue interface'den gelen ozellikle basa eleman ekleme
		System.out.println(ll); // [3, 10, 5, 7]
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		ll2.addAll(ll);
		System.out.println(ll2); // [3, 10, 5, 7]
		
		ll.addAll(3, ll);
		System.out.println(ll); // [3, 10, 5, 3, 10, 5, 7, 7]
		
	}

}
