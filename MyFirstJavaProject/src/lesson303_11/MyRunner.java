package lesson303_11;

public class MyRunner {

	public static void main(String[] args) {
		// initialize generic class
		// with Integer data
		GenericsClass<Integer> intObj = new GenericsClass<Integer>(5);
		System.out.println("Generic Class returns: " + intObj.getData());

		// initialize generic class again
		// with String data
		GenericsClass<String> stringObj = new GenericsClass<String>("Java");
		System.out.println("Generic Class returns: " + stringObj.getData());

	}

}
