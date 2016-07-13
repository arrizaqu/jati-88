package com.xsis.bt88.logic.day1;

public class SoalPR {
	
	public void proses(int n) {
	int nilaiTengah=n/2;
	int incrementNumber =1;
	int decrementNumber = n*2-1;
	
	for (int baris=0; baris<n; baris++) {
		int incrementNumber=1;
		for (int kolom=0; kolom<n; kolom++){
			if(baris==kolom) {
				System.out.print(incrementNumber +"\t");
			}
			else if(n-baris-kolom==1) {
				System.out.print(baris +"."+ kolom +"\t");
			}
		}
	}
	}

	public static void main (String ars[]){
		SoalPR pr = new SoalPR();
		pr.proses(9);
	}
}
