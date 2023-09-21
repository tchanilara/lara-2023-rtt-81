package hackerrankchallenge;

import java.util.Scanner;

public class SplitRegex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		if(s.length() == 0) {
			System.out.println(0);
		}else {
		String[] strings = s.split("[ !,?._'@]+");
		
		System.out.println(strings.length);
		for (String elt : strings)
            System.out.println(elt);
		}
		scan.close();
	}
}