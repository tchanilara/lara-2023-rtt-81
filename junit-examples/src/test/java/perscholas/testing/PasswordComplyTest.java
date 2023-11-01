package perscholas.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordComplyTest {
	@Test
	void testDoesPasswordComply() {
		boolean expectedResult = true;
		PasswordComply password = new PasswordComply("abcd1234");
		boolean actualResult = password.doesPasswordComply();
		Assertions.assertEquals(expectedResult, actualResult, "Password conditions failed!");
		System.out.println("Password conditions success!");
	}

	@Test
	void testDoesPasswordExist() {
		PasswordComply password = new PasswordComply("abcd1234");
		Assertions.assertThrows(java.sql.SQLException.class, () -> password.doesNotAlreadyExist(), "SQL Exception was thrown.");
	}

	@Test
	void testEmptyPassword() {
		PasswordComply password = new PasswordComply("Abcd1234!");
		Assertions.assertThrows(NullPointerException.class, () -> password.doesNotAlreadyExist(),
				"Null Exception was thrown but received SQL Exception.");
	}

}
