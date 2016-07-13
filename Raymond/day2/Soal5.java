package com.xsis.bt88.logic.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal5 {


	public void show(int n) {
			int a = 1;
			for(int baris=0;baris<n;baris++){
				for(int kolom=0;kolom<baris;kolom++){
					if(baris >= kolom){
						System.out.print(a + (kolom * 2));
					}
					else{
						System.out.print("");
					}
				}
				System.out.println("");
			}
		}

public static void main(String args[]) {
	Soal5 jawab = new Soal5();
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