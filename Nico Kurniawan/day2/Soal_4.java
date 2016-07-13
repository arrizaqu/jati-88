package com.xsis.bt88.day2;

public class Soal_4 {
	
	static void show(int x) {
		int tengah = x / 2;
		int a = 1, b = 0, c = 2 * (x - 1);
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i == j) {
					System.out.print(a + i * 2);
				}else if(j == tengah) {
					System.out.print(a + i * 2);
				} else if(i + j == x - 1) {
					System.out.print(c - i * 2);
				} else if(i == j) {
					System.out.print(a + i * 2);
				} else if(i == tengah) {
					System.out.print(b + j * 2);
				} else if(j == tengah) {
					System.out.print(a + i * 2);
				} else {
					System.out.print(' ');
				}
				
				System.out.print('\t');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}