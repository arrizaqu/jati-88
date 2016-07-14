package com.xsis.bt88.logic.day2a;

public class PreTest {
	
	static void show(int x) {
		int n;
		int m = 19;
		for(int baris = 1; baris < x; baris++) {
			for(int kolom = 1; kolom < x; kolom++) {
				if(baris == kolom) {
					n = baris * 2 - 1;
					System.out.print(n);
					
				}else if (baris + kolom == 10){
					m = m - 2;
					System.out.print(m);
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
