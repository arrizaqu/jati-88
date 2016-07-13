package com.xsis.bt88.logic.day2;

public class SoalTujuh {

	static void show(int x) {
		for(int baris = 0; baris < x; baris++) {
			for(int kolom = 0; kolom < x; kolom++)
				if((baris >= kolom ) && (baris <= kolom || baris + kolom >= x - 1))
					System.out.print(baris + "." + kolom + " \t");
				else
					System.out.print(" \t");
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
}
