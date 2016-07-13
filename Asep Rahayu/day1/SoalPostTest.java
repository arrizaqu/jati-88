package com.xsis.bt88.logic.day1;

public class SoalPostTest {

	public void proses(int n) {
		int nilaiTengah=(n/2)+1;
		for(int baris=1; baris<=n; baris++){
		for(int kolom=1; kolom<n; kolom++){
			if((baris+kolom==n) || (baris==kolom)  || (kolom==nilaiTengah) ){
			System.out.print(" \t");}
			else {
				System.out.print("\t");
		}} System.out.println("");
		 } }
		
	public static void main(String[] args){
		SoalPostTest soal = new SoalPostTest();
		soal.proses(9);
	}
}
