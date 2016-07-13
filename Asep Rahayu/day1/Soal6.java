package com.xsis.bt88.logic.day1;

public class Soal6 {
	public void proses(int n) {
		
	for(int baris=0; baris<n; baris++){
	for(int kolom=n; kolom>0; kolom--){
		if(baris>=kolom) {
		System.out.print("* \t");}
		else {
			System.out.print("\t");
	}}System.out.println("");
	 }
}

public static void main(String[] args){
	Soal6 soal = new Soal6();
	soal.proses(9);
}
}
