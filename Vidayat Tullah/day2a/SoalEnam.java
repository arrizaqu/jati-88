package com.xsis.bt88.logic.day2a;

public class SoalEnam {
	
	static void show(int x) {
		
		int n = (x *2)-2 ;
		for(int baris = 1; baris < x; baris++) {
			n = n -2;
			for(int kolom = 1; kolom < x; kolom++) {
				
				if(x - baris - kolom <=0) {
					
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
