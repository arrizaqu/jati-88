package com.xsis.bt88.logic.hari1;

public class soal_3 {
	public void show(int n){
		System.out.println("Soal 1");
		int dimensi_baris=n;
		int dimensi_kolom=n;
		for (int baris= 0;baris < dimensi_baris;baris++){
			for (int kolom= 0;kolom < dimensi_kolom;kolom++){
			if (baris==kolom)
			System.out.print("*\t");
			else if (n - baris - kolom == 1){
				System.out.print("#\t");
			}
			else
				System.out.print("\t");
		}
			System.out.println();
		
		}
		
		
	}
public static void main(String[] args) {
	soal_3 jawab = new soal_3();
	jawab.show(9);
	
}}
