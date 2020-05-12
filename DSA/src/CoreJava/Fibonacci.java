package CoreJava;
/*
* Shad M Khan
* Binet theory implemented in Java to find the nth fibonacci number
* 2nd February 2017
*/

//Input n through console
// 0>n>10^9

import java.io.*;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		long n = scanner.nextLong();
		//System.out.println(fibBINET(n));

		for (long i = 1; i <= n; i++) {
			System.out.println(fibBINET(i));
		}
		
	}
	// Calculate the golden ratio (φ) phi and apply the following formula
	// Fib(n) = φ^n/√5
	
	static long fibBINET(long n)
	 {
	    double sqrt5 = Math.sqrt(5);
	    double phi=(1+sqrt5)/2;
	    return (long) (Math.round((Math.pow(phi, n)/sqrt5)));
	 }
}
