package com.xsis.bt88.logic.day2;

public class Soal7A {

	public String[][] getDataArray(int n){
		// code
		int dimensiBaris = n;
		int dimensiKolom = n;
		int a = 1;
		int b =(n-1)*2;
	
		
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			
			for(int kolom =0; kolom < dimensiKolom; kolom++){
				if (baris==kolom) 
					
					data[baris][kolom] = a+"\t";
				else if (baris == n - kolom - 1)
					data[baris][kolom] = a+"\t";
				else if (baris < kolom && baris < n - kolom + 1)
					data[baris][kolom] = "A \t";
				else if (baris > kolom && baris > n - kolom - 1)
					data[baris][kolom] = "B \t";
				else 
					data[baris][kolom]="\t";
				
				
			
				}
				
			a = a+2;
			b=b-2;
			
			
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
		Soal7A jawab = new Soal7A();
		jawab.showing(9);
	}}
