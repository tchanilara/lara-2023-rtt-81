package perscholas.testing;

public class Calculator {
	public Double add(Double a, Double b) {
		return a+b;
	}
	
	public Double subttract(Double a, Double b) {
		return a-b;
	}
	
	public Double mutiple(Double a, Double b) {
		return a*b;
	}
	
	public Double divide(Double a, Double b) {
		return a/b;
	}
public static void main(String[] args) {
	Calculator c = new Calculator();
	
	Double sum = c.add(5.0, 6.0);
	Double sub = c.subttract(15.0, 6.0);
}
}
