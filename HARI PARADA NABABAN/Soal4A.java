package com.xsis.bt88.logic.day2;

public class Soal4A {
	public String[][] getDataArray(int n){
		// code
		int dimensiBaris = n;
		int dimensiKolom = n;
		int nilaiTengah = (n-1)/2;
		int a1 = 1;
		int b =(n-1) * 2;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			int b1 =0;
			for(int kolom =0; kolom < dimensiKolom; kolom++){
				if(baris == kolom )
					data[baris][kolom] = a1+"";
				else if (n-baris-kolom == 1)
						
						data[baris][kolom] = b+"";
				
				else if (kolom == nilaiTengah)
					data [baris][kolom]=a1+"";
				else if (baris == nilaiTengah)
					data [baris][kolom]=b1+"";

				else 
					data[baris][kolom]=" ";
			b1= b1+2;
				
			
				}
				
			a1 = a1 + 2;
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
				
				System.out.print(data[baris][kolom]+"\t");
				else 
					System.out.print(" \t");
				
			}
			System.out.println(" \t");
			
			}}
	
	public static void main(String[] args) {
		Soal4A jawab = new Soal4A();
		jawab.showing(9);
	}

}


