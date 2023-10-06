package review;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	// must also know how to create a new exception from scratch
	// 1) create new class
	// 2) extends Exception
	// 3) create constructor that takes a string message and calles super(message);
	String[] array = new String[10];

	public static void main(String[] args) {

		// I want you to create a new Question1 object and move all the code from this
		// main
		// method into a new function called run.
		Question1 q1 = new Question1();
		q1.run();

		// then I want you to move array to be a class level variable
		// implement a function .... public void replace(int position)
		// the function will set the value at position to ""

		// who knows what the empty string is??? ""
		// what is the difference between "" and null
		// an empty string "" is actually a String object created in memory with no
		// characters in it. Hence ""
		// null is a variable that has not even been created in memory.

		// write a function that will
		// 1) Create a new list (local variable)
		// 2) loop over array (at this point it will be a class variable)
		// 3) add all elements of the array that are not equal to "" to the new list
		// just created
		// 4) return the new list created.
	}
	public List<String> arrayToList() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if(array[i] !="")
			  list.add(array[i]);
		}
		return list;
		
	}

	void run() {
		// initialize this array so that all elements have the value "ten"
		// use a for loop to do it.
		for (int i = 0; i < array.length; i++) {
			array[i] = "ten";
		}

		// copy all of the values from array into list and print the message
		// I have addded {value} at position {position}
		List<String> list = new ArrayList<>();
		// use a for loop is a int pos use the length of the array
		// will be 2 lines of code inside the for loop
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
			System.out.println("I have addded " + array[i] + " at position " + i);
		}

	}
	
	public void replace(int position) {
		this.array[position] = "";
	}

}
