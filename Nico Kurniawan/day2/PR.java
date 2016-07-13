package com.xsis.bt88.day2;

public class PR {

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
		int mid = x / 2;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i == j && i > mid)
					System.out.print(fib(x - i - 1));
				else if(i + j == x - 1 && i > mid)
					System.out.print(fib(x - i - 1));
				else if(j == mid)
					System.out.print(fib(i));
				else
					System.out.print(' ');
				System.out.print('\t');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}