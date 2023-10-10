package lesson303_11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> Mylist = new ArrayList<Integer>();
		Mylist.add(20);
		Mylist.add(3);
		Mylist.add(58);
		Mylist.add(8);
		Mylist.add(9);
		System.out.println("Return boolean :" + Mylist.contains(3));
		System.out.println("Return index value of Element :" + Mylist.indexOf(3));
		System.out.println("Returns the actual Element at the given index :" + Mylist.get(2));
		System.out.println("Returns the length of the arraylist :" + Mylist.size());
		// Remove the element at the given index. Returns the removed element.
		// remove element at index 3
		Integer removedElement = Mylist.remove(3);
		System.out.println("Removed Element: " + removedElement);
		// remove all elements
		Mylist.clear();
		System.out.println("ArrayList after clear(): " + Mylist);
		ArrayList<String> al = new ArrayList();
		al.add("Jack");
		al.add("Tyler");
		al.add("James");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
