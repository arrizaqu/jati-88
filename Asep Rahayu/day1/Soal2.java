package com.xsis.bt88.logic.day1;

public class Soal2 {
	public void proses(int n) {
		for(int baris=0; baris<n; baris++){
		for(int kolom=0; kolom<n; kolom++){
			if(baris+kolom==n){
			System.out.print("* \t");}
			else {
				System.out.print("\t");
		}}System.out.println("");
		 }
	}
	
	public static void main(String[] args){
		Soal2 soal = new Soal2();
		soal.proses(9);
	}
	
}
