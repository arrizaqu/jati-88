package com.xsis.bt88.logic.day3;
import java.util.Scanner;



public class Soal8 {
	public static void main(String args[]) {
int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
		
		(new Soal8()).showing(n);
	}
	

	public String[][] getDataArray(int n){
		// code
		int DimensiBaris = n;
		int DimensiKolom = n;
	
		int nilaiTengah=(n-1)/2;
		
	
	
		String[][] array = new String[DimensiBaris][DimensiKolom];
		int a1=1;
		for(int baris = 0; baris < DimensiBaris; baris++){
			int b1=1;
			for(int kolom =0; kolom < DimensiKolom; kolom++){
				if((baris <= kolom && baris<=n -kolom-1 && baris% 2 == 0)||(baris>=kolom && baris>=n -kolom -1 && baris%2 ==0))
					array[baris][kolom] = String.valueOf(a1);
				else if ((baris<=kolom&& baris>=n-kolom-1 && kolom%2 ==0)||(baris>=kolom && baris<=n-kolom-1 && kolom%2 == 0))
					array[baris][kolom] = String.valueOf(b1);
				else 
					array[baris][kolom] = "";
				if(kolom<nilaiTengah) b1++; else b1--;
			}
			if(baris<nilaiTengah)a1++;else a1--;
					
				
			
				
			}
			
		
		
		return array;
	}
	
	public void showing(int n){
		{
			// code
			int DimensiBaris = n;
			int DimensiKolom = n;
		
			
			String[][] array = getDataArray(n);
			for(int baris = 0; baris < DimensiBaris; baris++){
				for(int kolom =0; kolom < DimensiKolom; kolom++){
					System.out.print(array[baris][kolom] + "\t");
				}
				System.out.println("\t");
			}}
		}
}
