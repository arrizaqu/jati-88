package com.xsis.bt88.logic.day2;


public class Soal2A {
	public String[][] getDataArray(int n){
		// code
		int dimensiBaris = n;
		int dimensiKolom = n;
	
		int b =(n-1) * 2;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			
			for(int kolom =0; kolom < dimensiKolom; kolom++){
				 if (n-baris-kolom == 1)
		
					data[baris][kolom] = b+"\t";

				else 
					data[baris][kolom]="\t";
		
				
			
				}
				
			b = b - 2;
			
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
				if (data[baris][kolom]!=null)
				
				System.out.print(data[baris][kolom]+"");
				else 
					System.out.print("");
				
			}
			System.out.println("");
			
			}}
	
	
	public static void main(String[] args) {
		Soal2A jawab = new Soal2A();
		jawab.showing(9);
	}}