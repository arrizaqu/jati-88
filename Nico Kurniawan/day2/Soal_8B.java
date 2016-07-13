package com.xsis.bt88.day2;

public class Soal_8B {
	
	public Integer[][] getDataArray(int n) {
		int dimensiKolom = n;
		int dimensiBaris = n;
		int max = (n - 1) * 2;
		Integer[][] data = new Integer[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris == kolom)
					data[baris][kolom] = (1 + baris * 2);
				else if(baris + kolom == n - 1) 
					data[baris][kolom] = (max - baris * 2);
				else if(baris > kolom && baris + kolom < n - 1)
					data[baris][kolom] = (-99);
				else if(baris < kolom && baris + kolom > n - 1)
					data[baris][kolom] = (-98);
				
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
				else if(data[baris][kolom] == -98)
					System.out.print('A');
				else if(data[baris][kolom] == -99)
					System.out.print('B');
				else
					System.out.print(data[baris][kolom]);
				System.out.print('\t');
			}
			System.out.println();
		} 
	}
	
	
	public static void main(String args[]) {
		(new Soal_8B()).showing(9);
	}
}
