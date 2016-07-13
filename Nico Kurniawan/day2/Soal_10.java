package com.xsis.bt88.day2;

public class Soal_10 {
	
	static int fib(int x) {
		
		if(x == 0)
			return 1;
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= x; i++) {
			c = a + b;
			a = b;
			b = c;
		}
			
		return c;
	}

	static void show(int x) {
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print(fib(i));
				System.out.print('\t');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}