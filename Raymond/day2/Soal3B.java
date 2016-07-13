package com.xsis.bt88.logic.day2;

public class Soal3B {
	
	//set data => return array
	public String[][] getDataArray(int n){
		//code
		int dimensiBaris = n;
		int dimensiKolom = n;
		int a = 1;
		int b = 0 + (2 * n - 2);
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				if(baris == kolom){
					data[baris][kolom] = String.valueOf(a + (baris * 2));
				}
				else if(baris + kolom == n - 1)
					data[baris][kolom] = String.valueOf(b - (baris * 2));
				else{
					data[baris][kolom] = "";
				}
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
		Soal3B jawab = new Soal3B();
		jawab.showing(9);
	}
}
