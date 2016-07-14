package com.xsis.bt88.day3;

public class Soal_2 {
	
	static int fib(int x) {
		
		if(x == 0 || x == 1 || x == 2)
			return 1;
		
		int a = 1, b = 1, c = 1, d = 0;
		
		for(int i = 3; i <= x; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
			
		return c;
	}

	static void show(int x) {
		
		for(int i = 0; i < x; i++) {
				System.out.print(fib(i));
				System.out.print(' ');
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}