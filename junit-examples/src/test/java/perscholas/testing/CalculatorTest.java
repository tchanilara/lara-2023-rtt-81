package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	/*
	@ParameterizedTest
	@CsvSource({
		"5, 5, 110",
		"10, 10, 20",
		"11.5, 10.5, 22.0"
	
	})
	public void addTest(Double a, Double b, Double answer) {
		Calculator c = new Calculator();

		Double actual = c.add(a, b);
		System.out.println("start");

		Assertions.assertEquals(answer, actual);
		System.out.println("end");
	}*/
	
	@BeforeAll
    public void beforeAll() {
        System.out.println("beforeAll/beforeClass Finished ");
    }

	@Test
	public void subtractTest() {
		Calculator c = new Calculator();

		Double expected = 10.0;

		Double actual = c.subttract(15.0, 5.0);
		//System.out.println("start");

		Assertions.assertEquals(expected, actual);
		System.out.println("end");
		//Assertions.assertEquals(5.0, c.subttract(10.0, 5.0));
	}
}
