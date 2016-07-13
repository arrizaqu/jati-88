package com.xsis.bt88.logic.day1;

public class SoalB {
	public void proses(int n) {
		int nilaiTengah=(n/2);
		for(int baris=1; baris<=n; baris++){
		for(int kolom=1; kolom<n; kolom++){
			if((baris+kolom-1==n) || (baris==kolom) || (baris==nilaiTengah) || (kolom==nilaiTengah) ){
			System.out.print(baris+"."+kolom+" \t");}
			else {
				System.out.print("\t");
		}}System.out.println("");
		 }
	}
	
	public static void main(String[] args){
		SoalB soal = new SoalB();
		soal.proses(9);
	}
}
