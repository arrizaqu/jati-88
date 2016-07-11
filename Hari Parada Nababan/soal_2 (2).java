package com.xsis.bt88.logic.hari1;

public class soal_2 {
	public void show(int n){
		System.out.println("Soal 2");
		int dimensi_baris=n;
		int dimensi_kolom=n;
		for (int baris= 0;baris<=dimensi_baris;baris++){
			for (int kolom= 0;kolom<=dimensi_kolom;kolom++){
			if (n-baris-kolom==1)
			System.out.print("*\t");
			else
				System.out.print(" \t");
		}
			System.out.println();
		
		}
		
		
	}
public static void main(String[] args) {
	soal_2 jawab = new soal_2();
	jawab.show(9);
	
}}

