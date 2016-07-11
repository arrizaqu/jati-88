package com.xsis.bt88.logic.day1;

public class PR {
	
	static void show(int x) {
		int a = 1, c = 1, d = 1 + 2 * x, p = x / 2;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				
				// Perbaiki
				if(c + i * 2 == 13)
					c += 2;
				if(d - i * 2 == 13)
					d -= 2;
				
				if(i == j)
					System.out.print(c + i * 2);
				else if(i + j == x - 1)
					System.out.print(d - i * 2);
				else if(i == p) {
					// Perbaiki
					if(a + j * 2 == 13)
						a += 2;
					
					System.out.print(a + j * 2);
				}
				else if(j == p)
					System.out.print(c + i * 2);
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
