package com.xsis.bt88.logic.day2a;

public class SoalLima {
	
	static void show(int x) {
		
		
		for(int baris = 1; baris < x; baris++) {
			int n = -1;
			for(int kolom = 1; kolom < x; kolom++) {
				if(baris >= kolom) {
					n = n +2;
					System.out.print(n);
					
				}
				
				else {
					System.out.print(' ');
				}
				
				System.out.print('\t');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(10);
	}
	

}
