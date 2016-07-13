package com.xsis.bt88.logic.day2;

public class Soal7B {
	
	//set data => return array
	public String[][] getDataArray(int n){
		//code
		int dimensiBaris = n;
		int dimensiKolom = n;

		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			int tambah = 1;
			int kurang = 0;
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				if(baris==kolom){
					data[baris][kolom] = String.valueOf(tambah);
				}
				else if(baris + kolom == n - 1){
					data[baris][kolom] = String.valueOf(kurang);
				}
				else if(baris<kolom && baris+kolom < n-1){
					data[baris][kolom] = "A";
				}
				else if(baris>kolom && baris+kolom > n-1){
					data[baris][kolom] = "B";
				}
				else{
					data[baris][kolom] = "";
				}	
				tambah = tambah + 2;
				kurang = kurang + 2;
			}
		}
		return data;	
	}
			
	//menampilkan data => menampilkan array
	public void showing(int n){
		int dimensiBaris = n;
		int dimensiKolom = n;
		
		String[][] data = getDataArray(n);
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				System.out.print(data[baris][kolom] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Soal7B jawab = new Soal7B();
		jawab.showing(9);
	}
}
