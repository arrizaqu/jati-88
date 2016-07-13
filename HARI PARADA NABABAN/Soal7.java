package com.xsis.bt88.logic.day2;

public class Soal7 {
	public void show(int n){
		System.out.println("Soal 1");
		
		int a = 1;
		int b =(n-1)*2;
			for(int baris = 1; baris <= n; baris++){
				
				for(int kolom = 1; kolom <= n; kolom++ ){
					if (baris==kolom) 
						System.out.print(a +"\t");
					else if (baris == n - kolom + 1)
					System.out.print(b + "\t");
					else if (baris < kolom && baris < n - kolom + 1)
					System.out.print("A \t");
					else if (baris > kolom && baris > n - kolom + 1)
						System.out.print("B \t");
					else 
						System.out.print("\t");
				}
				System.out.println("");
				a = a+2;
				b=b-2;
				
				
				
			}
	}
	public static void main(String[] args) {
	Soal7 jawab = new Soal7();
	jawab.show(9);

	}}



