package com.xsis.bt88.day2;

public class Soal_5 {
	
	static void show(int x) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(1 + j * 2);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}