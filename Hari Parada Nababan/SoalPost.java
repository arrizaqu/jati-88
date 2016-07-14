package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class SoalPost {
	public static void main(String args[]) {
int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
		
		(new SoalPost()).showing(n);
	}
	

	private static int[] fibo(int n)
	{
		int[] array1 = new int[n];
		for (int baris =0;baris<n;baris++){
			if(baris<2)
				array1[baris]=1;
			else
				array1[baris]=array1[baris-1]+array1[baris-2];
		}
				return array1;
	}
	public String[][] getDataArray(int n){
		// code
		int DimensiBaris = n;
		int DimensiKolom = (n*2)-1;
		int[] array1=fibo(n);
		
		int NilaiTengah=(n-1)/2;
		
	
	
		String[][] array = new String[DimensiBaris][DimensiKolom];
		
		for(int baris = 0; baris < DimensiBaris; baris++){
			int a1=0; 
			int b1=0;
			for(int kolom =0; kolom < DimensiKolom; kolom++){
				if(baris == kolom ||baris==n -kolom-1 ||kolom==baris+n-1||baris==(2*n)-kolom-2)
						array[baris][kolom] = String.valueOf(array1[a1]);
				
				else 
					array[baris][kolom]="";
				if(kolom<n-1){
					a1++; if(kolom!= NilaiTengah)b1++;
					
				}
				else{
					a1--;
					if(kolom!=NilaiTengah +n-1)b1--;
				}
			}
			
		
		}		
		return array;
	}
	
	public void showing(int n){
		{
			// code
			int DimensiBaris = n;
			int DimensiKolom = (2*n)-1;
		
			
			String[][] array = getDataArray(n);
			for(int baris = 0; baris < DimensiBaris; baris++){
				for(int kolom =0; kolom < DimensiKolom; kolom++){
					System.out.print(array[baris][kolom] + "\t");
				}
				System.out.println("\t");
			}}
		}
}

