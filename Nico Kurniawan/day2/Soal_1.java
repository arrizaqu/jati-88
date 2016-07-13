package com.xsis.bt88.day2;

public class Soal_1 {
	
	static void show(int x) {
		int deret = 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i == j) {
					System.out.print(deret);
					deret += 2;
				} else {
					System.out.print(' ');
				}
				
				System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}