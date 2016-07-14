package com.xsis.bt88.logic.day3;


import java.util.Scanner;



public class Soal7 {
	public static void main(String args[]) {
int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
		
		(new Soal7()).showing(n);
	}
	

	private static int[] fibo(int n)
	{
		int[] f = new int[n];
		for (int baris =0;baris<n;baris++){
			if(baris<2)
				f[baris]=1;
			else
				f[baris]=f[baris-1]+f[baris-2];
		}
				return f;
	}
	public String[][] getDataArray(int n){
		// code
		int aI = n;
		int aJ = n;
		int[] f =fibo(n);
		int nilaiTengah=(n-1)/2;
		
	
	
		String[][] array = new String[aI][aJ];
		int i1=0;
		for(int baris = 0; baris < aI; baris++){
			int i2=0;
			for(int kolom =0; kolom < aJ; kolom++){
				if((baris <= kolom && baris<=n -kolom-1)||(baris>=kolom && baris>=n -kolom -1))
					array[baris][kolom] = String.valueOf(f[i1]);
				else if ((baris<=kolom&& baris>=n-kolom-1)||(baris>=kolom && baris<=n-kolom-1))
					array[baris][kolom] = String.valueOf(f[i2]);
				else 
					array[baris][kolom] = "";
				if(kolom<nilaiTengah) i2++; else i2--;
			}
			if(baris<nilaiTengah)i1++;else i1--;
					
				
			
				
			}
			
		
		
		return array;
	}
	
	public void showing(int n){
		{
			// code
			int aI = n;
			int aJ = n;
		
			
			String[][] array = getDataArray(n);
			for(int baris = 0; baris < aI; baris++){
				for(int kolom =0; kolom < aJ; kolom++){
					System.out.print(array[baris][kolom] + "\t");
				}
				System.out.println("");
			}}
		}
}

