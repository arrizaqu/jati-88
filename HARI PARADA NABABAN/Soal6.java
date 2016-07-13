package com.xsis.bt88.logic.day2;

public class Soal6 {
	public void show(int n){
		System.out.println("Soal 1");
		int a =(n-1)*2;
			for(int baris = 1; baris <= n; baris++){
				
				for(int kolom = 1; kolom <= n; kolom++ ){
					if (baris>=n-kolom+1)
						System.out.print(a + "\t");
					else 
						System.out.print(" \t");
					
				}
				System.out.println(" ");
				a = a-2;
				
				
				
			}
	}
	public static void main(String[] args) {
	Soal6 jawab = new Soal6();
	jawab.show(9);

	}}



