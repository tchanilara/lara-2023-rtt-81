package com.perscholas.java_basics;

public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumber1 = 50;
		int iNumber2 = 120;
		int iResultSum;
		iResultSum = iNumber1 + iNumber2;
		System.out.println(iResultSum);
		
		double dNumber1 = 50.25;
		double dNumber2 = 150.25;
		double dResultSum;
		dResultSum = dNumber1 + dNumber2;
		System.out.println(dResultSum);
		
		double dNumber3 = 50.25;
		int iNumber3 = 15;
		double dResultSum3;
		dResultSum3 = dNumber3 + iNumber3;
		System.out.println(dResultSum3);
		
		int iNumber4 = 50;
		int iNumber5 = 120;
		int iResultSum2;
		iResultSum2 = iNumber5/iNumber4;
		System.out.println(iResultSum2);
		
		int iNumber6 = 50;
		double dNumber4 = 120;
		double dResultSum4;
		dResultSum4 = dNumber4/iNumber6;
		System.out.println(dResultSum4);
		
		int y = 6;
		int x = 5;
		double q;
		q = (double)y/x;
		System.out.println(q);
		
		final double PI = 3.14;
		int raduis = 3;
		System.out.println(raduis * raduis * PI); 
		
		double coffe = 10.23;
		double espresso = 13.93;
		double greenTea = 1.23;
		double subtotal;
		double totalSale;
		final double SALES_TAX = 0.006;
		subtotal = 3 * coffe + 4 * espresso + 2 * greenTea;
		totalSale = subtotal + subtotal * SALES_TAX;
		System.out.printf("%.2f", totalSale); 

	}

}
