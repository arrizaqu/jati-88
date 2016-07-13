package com.xsis.bt88.logic.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal9 {


	public void show(int n) {
			for(int baris=1; baris<=n ;baris++){
				int next;
				int first = 0;
				int second = 1;
				for(int kolom=1;kolom<=n;kolom++){
					if(kolom<=1)
					next = kolom;
					else{
						next = first+second;
						first = second;
						second = next;
					}
					System.out.print(next);
				}
				System.out.println("");
			}
	}

public static void main(String args[]) {
	Soal9 jawab = new Soal9();
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