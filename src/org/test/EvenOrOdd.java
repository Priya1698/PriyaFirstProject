package org.test;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
	 System.out.println("Enter the No");
	 Scanner s = new Scanner(System.in);
	int n = s.nextInt(); 
	if (n%2==0) {
		System.out.println("even");
		}
	else {
		System.out.println("odd");
	}
	}

}
