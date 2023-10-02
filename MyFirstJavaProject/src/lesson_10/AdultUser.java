package lesson_10;

public class AdultUser  implements LibraryUser {
	int age;
	String bookType;

	public void registerAccount() {
		if (this.age >= 12) {
			System.out.println("You have successfully registered under an Adult Account.");
		} else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}

	}
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
	public AdultUser() {}

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	public void requestBook() {
		if (this.bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
		}

	}

}
