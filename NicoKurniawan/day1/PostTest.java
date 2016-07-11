package com.xsis.bt88.logic.day1;

public class PostTest {
	
	static void show(int x) {
		int p = (x / 2) ;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++)
				if((i == j && j > p) || (i + j == x - 1 && i > p) || j == p)
					System.out.print('*');
				else
					System.out.print(' ');
			System.out.println();
		}
	}
	
//	public static void main(String args[]) {
//		show(9);
//	}
}
