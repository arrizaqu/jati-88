package com.xsis.bt88.logic.day4;

public class SoalEnam {
	
static void show (int x){
		int nilaiTengah = x /2;
		
		int ganjil2 = 1;
		int ganjil3 = 1;
		for (int baris = 0; baris < x; baris++){
			int ganjil = 1;
			for (int kolom = 0; kolom < x; kolom++){
				
					if(baris == nilaiTengah &&  kolom <=nilaiTengah){
						System.out.print(ganjil + "\t"); // untuk paling bawah
						ganjil = ganjil + 2;
					}
					
					else if(kolom >=1 && kolom <= nilaiTengah && baris == (nilaiTengah - 1)){ // kedua paling bawah
						System.out.print(ganjil + "\t");
						ganjil = ganjil + 2;
					}
					
					else if(baris + kolom == nilaiTengah){ // kedua paling bawah
						System.out.print(ganjil + "\t");
						ganjil = ganjil + 2;
					}
					
					
					
					
					else {System.out.print("\t");}
				}
			System.out.println("");
			}
			
		
	}

	public static void main (String args[]){
		show(9);
		
	}

}
