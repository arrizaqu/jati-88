package com.xsis.bt88.day2;

public class Soal_4b {
	
	public Integer[][] getDataArray(int n) {
		int dimensiKolom = n;
		int dimensiBaris = n;
		int c = 2 * (n - 1);
		int tengah = n / 2;
		Integer[][] data = new Integer[dimensiBaris][dimensiBaris];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris == kolom) {
					data[baris][kolom] = (1 + baris * 2);
				}else if(kolom == tengah) {
					data[baris][kolom] = (1 + baris * 2);
				} else if(baris + kolom == n - 1) {
					data[baris][kolom] = (c - baris * 2);
				} else if(baris == tengah) {
					data[baris][kolom] = (0 + kolom * 2);
				} else if(kolom == tengah) {
					data[baris][kolom] = (1 + baris * 2);
				}
			}
		}
		return data;
	};
	
	public void showing(int n) {
		
		int dimensiKolom = n;
		int dimensiBaris = n;
		
		Integer[][] data = getDataArray(n);
		
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(data[baris][kolom] == null)
					System.out.print(' ');
				else
					System.out.print(data[baris][kolom]);
				System.out.print('\t');
			}
			System.out.println();
		} 
	}
	
	
	public static void main(String args[]) {
		(new Soal_4b()).showing(9);
	}
}
