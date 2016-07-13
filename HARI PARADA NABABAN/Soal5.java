package com.xsis.bt88.logic.day2;

public class Soal5 {
	public void show(int n){
	System.out.println("Soal 1");
	
		for(int baris = 1; baris <= n; baris++){
			int a =1;
			for(int kolom = 1; kolom <= n; kolom++ ){
				if (baris>=kolom)
					System.out.print(a + "\t");
				else 
					System.out.print(" \t");
				a = a+2;
			}
			System.out.println(" ");
			
			
			
		}
}
public static void main(String[] args) {
Soal5 jawab = new Soal5();
jawab.show(9);

}}
