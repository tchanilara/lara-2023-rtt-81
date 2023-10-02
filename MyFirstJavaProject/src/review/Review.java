package review;

public class Review {

	public static void main(String[] args) {
		// task 1
		int sum = 0;
		for (int i =1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Result for task 1: " + sum);
		
		// task 2
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += (i % 2);
		}
		System.out.println("Result for task 2: " + sum);
		// task 3
		 sum = 0;
		for (int i =1; i <= 100; i++) {
			sum += (i / 2);
		}
		System.out.println("Result for task 3: " + sum);
		int number = 10;
		while(number > 0) {
			System.out.println("The number is : " + number);
			number--;
		}


	}

}
