package com.xsis.bt88.logic.day2;

public class Soal4 {
	public void show(int n){
		System.out.println("Soal 1");
		int a =1;
		int b = (n+1)/2;
			for(int baris = 1; baris <= n; baris++){
				int  b1=0;
				
				for(int kolom = 1; kolom <= n; kolom++ ){
					if (baris==kolom)
						System.out.print(a+"\t");
					else if (baris==b)
						System.out.print(b1+"\t");
					else if (kolom==b)
						System.out.print(a+"\t");
				
					 else if (baris==n-kolom+1)
					System.out.print(b1+"\t");
					
					else 
						System.out.print("\t");
					b1 = b1+2;
					
				}
				System.out.println("");
				a = a+2;
				
				
				
				
				
			}
	}
public static void main(String[] args) {
	Soal4 jawab = new Soal4 ();
	jawab.show(9);
	
}}