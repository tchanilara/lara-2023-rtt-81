package lesson303_3;

import java.text.DecimalFormat;
import java.util.StringJoiner;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Java Full Stack Developer");
		int len = str.length();
		System.out.println("Length : " + len);
		int cap = str.capacity();
		System.out.println("Capacity : " + cap);
		// ----- append()--------------------
		str.append("and Software Eng "); // appends a string in the previously defined string.
		System.out.println(str);
		str.append("Java is my favourite language ");
		str.append("but i love python");
		System.out.println(str);
		// ----------- reverse()----------------------
		StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
		System.out.println("Original String: " + stringName);
		stringName.reverse();
		System.out.println("Reversed String: " + stringName);

		// ------ insert()----------------
		StringBuffer s = new StringBuffer("Java");
		s.insert(0, "language");
		System.out.println(s);
		// --------- replace()---------
		StringBuffer sT = new StringBuffer("Java");
		sT.replace(0, 4, "Hello");
		System.out.println(sT);

		str = new StringBuffer("Welcome to Java Fullstack ");
		System.out.println("Original string: " + str);
		System.out.println("Substring with start index: " + str.substring(5));
		System.out.println("Substring with start and end index: " + str.substring(5, 10));

		StringJoiner joinNames = new StringJoiner(",", "[",
				"]"); /* passing comma(,) and square-brackets as delimiter */
		// ----- Adding values to StringJoiner---
		joinNames.add("New York");
		joinNames.add("New Jersey");

		// ---- Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "[",
				"]"); /* passing colon(:) and square-brackets as delimiter */

		// ---Adding values to StringJoiner-----
		joinNames2.add("Dallas");
		joinNames2.add("Chicago");
		// ---- Merging two StringJoiner ----
		StringJoiner merge = joinNames.merge(joinNames2);
		System.out.println(merge);
		
		String pattern = "#,####.##";
	      double number = 123456789.123;
	      
	      DecimalFormat numberFormat = new DecimalFormat(pattern);

	      System.out.println(number);
	      
	      System.out.println(numberFormat.format(number));
	      

	}

}
