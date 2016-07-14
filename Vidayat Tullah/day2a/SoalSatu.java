package com.xsis.bt88.logic.day2a;

public class SoalSatu {
	
	static void show(int x) {
		int ganjil = 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i == j) {
					System.out.print(ganjil);
					ganjil += 2;
				} else {
					System.out.print(" \t");
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
