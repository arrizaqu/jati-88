package com.xsis.bt88.logic.day2a;

public class SoalEmpat {
	
	static void show(int x) {
		int n;
		int nilaiTengah = x /2;
		for(int baris = 1; baris < x; baris++) {
			for(int kolom = 1; kolom < x; kolom++) {
				if(baris == kolom) {
					n = baris * 2 - 1;
					System.out.print(n);
					
				}else if (baris + kolom == 10){
					n = baris * 2 - 2;
					System.out.print(n);
				}else if (kolom == nilaiTengah){
					n = baris * 2 - 1;
					System.out.print(n);
				}
				else if (baris == nilaiTengah){
					int o = 0;
					System.out.print(o);
					
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
