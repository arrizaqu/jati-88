package com.xsis.bt88.logic.day2a;

public class SoalSembilan {
	
	static void show (int x){
		
		for (int baris = 1; baris < x; baris++){
			int a = 1;
			int b = 1;
			for (int kolom = 1; kolom < x; kolom++){
				if (kolom == 1){
					System.out.print("1 \t");}
					else {
						System.out.print(a + " \t");
						a = a +b;
						b = a - b;
					}
				}
			System.out.println("");
			}
			
		
	}
	
	public static void main(String args[]){
		show (10);
	}
}
