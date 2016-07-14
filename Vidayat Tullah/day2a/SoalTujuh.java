package com.xsis.bt88.logic.day2a;

public class SoalTujuh {
	
	static void show(int x) {
		int n;
		int o = 18;
		for(int baris = 1; baris < x; baris++) {
			for(int kolom = 1; kolom < x; kolom++) {
				if(baris == kolom) {
					n = baris * 2 - 1;
					System.out.print(n);
				}else if (baris + kolom == 10){
					o = o - 2;
					System.out.print(o);
				}else if ((baris < kolom) && (baris + kolom <= x -1)){
					
					System.out.print("A");
				}else if ((kolom < baris) && (baris + kolom >= x -1)){
					
					System.out.print("A");
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
