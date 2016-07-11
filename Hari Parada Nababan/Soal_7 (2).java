package com.xsis.bt88.logic.hari1;

public class Soal_7 {
	public void show(int n){
		System.out.println("Soal 7");
		int dimensi_baris=n;
		int dimensi_kolom=n;
		for (int baris= 0;baris<dimensi_baris;baris++){
			for (int kolom= 0;kolom<dimensi_kolom;kolom++){
			if (baris<=kolom && n-baris-kolom>=1)
			System.out.print("*\t");
			else if (baris>=kolom && n-baris-kolom<=1){
				System.out.print("&\t");
			}
			else
				System.out.print(" \t");
		}
			System.out.println();
		
		}
		
		
	}
public static void main(String[] args) {
	Soal_7 jawab = new Soal_7();
	jawab.show(9);
	
}}


