package com.xsis.bt88.logic.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal4 {


	public void show(int n) {
		int a = 1, 
			b = 0 + (2 * n - 2), 
			c = 0, 
			nilaiTengah = n / 2;
		
		for(int baris = 0; baris < n; baris++) {
			for(int kolom = 0; kolom < n; kolom++) {
				
				//Diagonal Kanan
				if(baris == kolom)
				System.out.print(a + (baris * 2));
				//Diagonal Kiri
				else if(baris + kolom == n - 1)
					System.out.print(b - (baris * 2));
				//Vertical
				else if(kolom == nilaiTengah)
					System.out.print(a + (baris * 2));
				//Horizontal
				else if(baris == nilaiTengah) {
					System.out.print(c + (kolom * 2));
				}
				else
					System.out.print(' ');
				System.out.print('\t');
			}
			System.out.println();
		}
	}

public static void main(String args[]) {
	Soal4 jawab = new Soal4();
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