package com.xsis.bt88.day3;

public class Soal_9 {
	
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
				if(i == mid && j == mid)
					System.out.print('1');
				else if(i == 0 ||  i == x - 1 || j == 0 || j == x - 1)
					System.out.print('1');
				else if((j >= 2 &&  j <= x - 3) && (i == 2 || i == x - 3))
					System.out.print('2');
				else if((i >= 3 &&  i <= x - 3) && (j == 2 || j == x - 3))
					System.out.print('2');
				else
					System.out.print(' ');
				
				System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}