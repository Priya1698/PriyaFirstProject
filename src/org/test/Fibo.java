package org.test;

public class Fibo {
	public static void main(String[] args) {
		int a=0,b=1,c;
		int n=100;
		System.out.println(a);
		for (int i = 0; i <n ; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
			
		}
		
	}

}
