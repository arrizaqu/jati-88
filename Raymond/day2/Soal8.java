package com.xsis.bt88.logic.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal8 {
	public void show(int n){		
		for(int baris = 0; baris < n ;baris++){
			int tambah = 1;
			int kurang = 0;
			for(int kolom = 0; kolom < n; kolom++){
				if(baris==kolom){
					System.out.print(tambah+"\t");
				}
				else if(baris + kolom == n - 1){
					System.out.print(kurang+"\t");
				}
				else if(baris<kolom && baris+kolom > n-1){
					System.out.print("B\t");
				}
				else if(baris>kolom && baris+kolom < n-1){
					System.out.print("A\t");
				}
				else{
					System.out.print("\t");
		}
			tambah = tambah + 2;
			kurang = kurang + 2;
	}
		System.out.println("\t");
	}
}
	
	public static void main(String args[]){
		Soal8 jawab = new Soal8();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.print("Input number : ");
			int angka = Integer.parseInt(br.readLine());
			jawab.show(angka); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
