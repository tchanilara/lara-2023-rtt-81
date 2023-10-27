package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator c = new Calculator();

		Double expected = 10.0;

		Double actual = c.add(5.0, 5.0);

		Assertions.assertEquals(expected, actual);

		Assertions.assertEquals(15.0, c.add(10.0, 5.0));
	}

	@Test
	public void subtractTest() {
		Calculator c = new Calculator();

		Double expected = 10.0;

		Double actual = c.subttract(15.0, 5.0);

		Assertions.assertEquals(expected, actual);

		Assertions.assertEquals(5.0, c.subttract(10.0, 5.0));
	}
}
