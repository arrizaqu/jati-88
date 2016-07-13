package com.xsis.bt88.logic.day2;

public class PostTestDaySatu {
	
	static void show (int x){
		int nilaiTengah = x /2;
		for (int baris = 0; baris < x; baris++){
			
			for (int kolom = 0; kolom <x; kolom++){
				if (kolom == nilaiTengah){
				System.out.print(baris + "." + kolom + " \t");
				} else if ((baris + kolom ==9 || kolom + baris >= 10) && (baris + kolom >= x || baris + kolom <= 14))
					System.out.print(baris + "." + kolom + " \t"); 
				else System.out.print("\t");
			}
			System.out.println("");
		}
		
	}
	
	public static void main (String args[]) {
		show(10);
	}
	

}
