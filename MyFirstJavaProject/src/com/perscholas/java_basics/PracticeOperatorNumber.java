package com.perscholas.java_basics;

public class PracticeOperatorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//task 1
		int x, y, z;
		x = 2;
		System.out.println("The binay string of "+ x + " is : " + Integer.toBinaryString(x));
		x = x << 1;// 4 = 100
		System.out.println("Its left shifted value by is : "+ x + " and binary string is : " + Integer.toBinaryString(x));

		//task 2
		x = 150;
		System.out.println("The binay string of "+ x + " is : " + Integer.toBinaryString(x));
		x = x >> 2;// 8 = 1000
		System.out.println("Its right shifted value by is : "+ x + " and binary string is : " + Integer.toBinaryString(x));

		//task 3
		x = 7;
		y = 17;
		z = x & y;
		System.out.println(x + " & "+ y + " is : " + z);

		//task 4
		z = x | y;
		System.out.println(x + " | "+ y + " is : " + z);

		//task 5
		System.out.println(" Before postfix "+ x);
		++x;
		System.out.println(" After postfix "+ x);

		//task 6
		x = x + 1;
		x += 1;
		x++;
		
		//7
		x = 5;
		y = 8;
		z = ++x + y;
		System.out.println(" Sum "+ z);
		x = 5;
		z = x++ + y;
		System.out.println(" Sum "+ z);
		
		
	}

}
