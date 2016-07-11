package com.xsis.bt88.logic.day1;

public class Soal_6 {
	
	static void show(int x) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++)
				if(j + i >= x - 1)
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
