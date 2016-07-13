package com.xsis.bt88.logic.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal2 {

	public void show(int n) {
		int a = 0 + (2 * n - 2);
		
		for(int baris = 0; baris < n; baris++) {
			for(int kolom = 0; kolom < n; kolom++) {
				if(baris + kolom == n - 1)
					System.out.print(a - (baris * 2));
				else
					System.out.print(' ');
				System.out.print('\t');
			}
			System.out.println();
		}
	}

public static void main(String args[]) {
	Soal2 jawab = new Soal2();
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