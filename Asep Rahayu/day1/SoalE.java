package com.xsis.bt88.logic.day1;

public class SoalE {
	public void proses(int n) {
		
		for(int baris=n; baris>=0; baris--){
		for(int kolom=baris; kolom<=n; kolom++){
			System.out.print(" \t"); }
		for(int k=1; k<=baris; k++) 
			System.out.println("*");
		 }
	}

	public static void main(String[] args){
		SoalE soal = new SoalE();
		soal.proses(9);
	}
}
