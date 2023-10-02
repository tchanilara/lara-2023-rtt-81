package lesson_10;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// test case #1
		KidUser kid = new KidUser();
		kid.setAge(10);
		kid.registerAccount();
		kid.setAge(18);
		kid.registerAccount();
		kid.setBookType("Kids");
		kid.requestBook();
		kid.setBookType("Fiction");
		kid.requestBook();
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++\n");

		// test case #1
		AdultUser adult = new AdultUser();
		adult.setAge(5);
		adult.registerAccount();
		adult.setAge(23);
		adult.registerAccount();
		adult.setBookType("Kids");
		adult.requestBook();
		adult.setBookType("Fiction");
		kid.requestBook();

	}

}
