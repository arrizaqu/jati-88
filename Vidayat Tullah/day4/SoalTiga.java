package com.xsis.bt88.logic.day4;

public class SoalTiga {
	
static void show (int x){
		int nilaiTengah = x /2;
		
		int ganjil2 = 3;
		int ganjil3 = 1;
		for (int baris = 0; baris < x; baris++){
			int ganjil = 1;
			for (int kolom = 0; kolom < x; kolom++){
				if(baris + kolom == nilaiTengah && baris > 0){ // garis kiri
						System.out.print(ganjil + "\t");
						ganjil = ganjil + 1;
					}
				
				else if(kolom - baris == nilaiTengah && baris > 0){ // garis kanan
					System.out.print(ganjil2 + "\t");
					ganjil2 = ganjil2 + 2;
				}
				
				else if(baris == nilaiTengah){ // garis bawah
					System.out.print(ganjil + "\t");
					ganjil = ganjil + 1;
				}
				
					
				
				else if(kolom == nilaiTengah && baris < nilaiTengah){ 
					System.out.print(ganjil3 + "\t");
					ganjil3 = ganjil3 + 1;
				}
				
				else if(kolom == nilaiTengah && baris < nilaiTengah){ 
					System.out.print(ganjil3 + "\t");
					ganjil3 = ganjil3 + 1;
				}
				
				else if(baris + kolom <= x && baris == nilaiTengah -1 && kolom > 0){ 
					System.out.print(ganjil + "\t");
					ganjil = ganjil + 1;
				}
				
				else if(baris + kolom < x && baris == nilaiTengah /2 && kolom > nilaiTengah /2){ 
					System.out.print(ganjil + "\t");
					ganjil = ganjil + 1;
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
