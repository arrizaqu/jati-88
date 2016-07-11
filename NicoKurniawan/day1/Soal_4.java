package com.xsis.bt88.logic.day1;

public class Soal_4 {
	
	static void show(int x) {
		int p = (x / 2) ;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++)
				if(i == j || i + j == x - 1 || i == p || j == p)
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
