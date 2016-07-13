package com.xsis.bt88.logic.day1;

public class Soal7b {
	public void proses(int n) {
		
		for(int baris=0; baris<n; baris++){
		for(int kolom=0; kolom<n; kolom++){
			if(((baris>=kolom) || (baris+kolom<=n-1)) && ((baris<=kolom) || (baris+kolom>=n-1))){
			System.out.print("* \t");}
			else {
				System.out.print("\t"); } 
			}System.out.println("\t");
		 }
	}

	public static void main(String[] args){
		Soal7b soal = new Soal7b();
		soal.proses(9);
	}
}
