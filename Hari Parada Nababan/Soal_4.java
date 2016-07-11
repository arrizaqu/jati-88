package com.xsis.bt88.logic.hari1;

public class Soal_4 {
	public void show(int n){
		System.out.println("Soal 4");
		int dimensi_baris=n;
		int dimensi_kolom=n;
		int nilaitengahhorizontal = n/2;
		for (int baris= 0;baris<dimensi_baris;baris++){
			for (int kolom= 0;kolom<dimensi_kolom;kolom++){
			if (baris==kolom)
			System.out.print("*\t");
			else if(n - baris- kolom == 1)
				System.out.print("#\t");
			else if(baris == nilaitengahhorizontal)
				System.out.print("$\t");
			else if (kolom == nilaitengahhorizontal)
				System.out.print("@\t");
			else  
				System.out.print("\t");
		}
			System.out.println();
		
		}
		
	}
public static void main(String[] args) {
	Soal_4 jawab = new Soal_4();
	jawab.show(9);
	

}}
