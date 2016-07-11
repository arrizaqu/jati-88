package com.xsis.bt88.logic.hari1;

public class Soal_Post {
	public void show(int n){
		System.out.println("Soal Post");
		int dimensi_baris=n;
		int dimensi_kolom=n;
		int nilaitengahhorizontal = n/2;
		for (int baris= 0;baris<dimensi_baris;baris++){
			for (int kolom= 0;kolom<dimensi_kolom;kolom++){

			if (kolom == baris && 1>=n-nilaitengahhorizontal-baris)
				System.out.print("@\t");
			else if (1==n-baris-kolom && kolom<=n-nilaitengahhorizontal){
				System.out.print("*\t");
			}
			
			else  
				System.out.print("\t");
		}
			System.out.println();
		
		}
		
	}
public static void main(String[] args) {
	Soal_Post jawab = new Soal_Post();
	jawab.show(9);
	

}}

