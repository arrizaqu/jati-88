package com.xsis.bt88.java.teori;

public class Soal1Array {
	
	//set data => return array
	public String[][] getDataArray(int n){
		// code
		int dimensiBaris = n;
		int dimensiKolom = n;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom =0; kolom < dimensiKolom; kolom++){
				if(baris == kolom){
					data[baris][kolom] = "*";
				} else if( n - baris - kolom == 1) {
					data[baris][kolom] = "#";
				}
				
			}
		}
		
		return data;
	}
	
	//menampilkan data menapilkan array
	public void showing(int n){
		// code
		int dimensiBaris = n;
		int dimensiKolom = n;
		
		String[][] data = getDataArray(n);
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom =0; kolom < dimensiKolom; kolom++){
				System.out.print(data[baris][kolom] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Soal1Array jawab = new Soal1Array();
		jawab.showing(9);
	}

}
