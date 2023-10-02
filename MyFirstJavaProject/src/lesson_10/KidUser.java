package lesson_10;

public class KidUser implements LibraryUser {
	int age;
	String bookType;

	public void registerAccount() {
		if (this.age <= 11) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, age must be less than 12 to register as a kid.");
		}

	}

	public KidUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	public KidUser() {}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public void requestBook() {
		if (this.bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}

	}

}
