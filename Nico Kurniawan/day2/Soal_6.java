package com.xsis.bt88.day2;

public class Soal_6 {
	
	static void show(int x) {
		int max = (x - 1) * 2;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i + j >= x - 1)
					System.out.print(max - i * 2);
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