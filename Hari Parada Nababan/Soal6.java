package com.xsis.bt88.logic.day3;


import java.util.Scanner;


public class Soal6 {
	public static void main(String args[]) {
int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
		
		(new Soal6()).showing(n);
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
		int DimensiKolom = n;
		int[] array1 =fibo(n);
	
		String[][] array = new String[DimensiBaris][DimensiBaris];
		for(int baris = 0; baris < DimensiBaris; baris++){
			for(int kolom =0; kolom < DimensiKolom; kolom++){
				if(baris == kolom)
					array[baris][kolom] = String.valueOf(array1[baris]);
			else if (baris==n-kolom-1)
					array[baris][kolom] = String.valueOf(array1[n-baris-1]);
			else if (baris<kolom && baris<n - kolom -1)
					array[baris][kolom] = "A";
				else if(baris<kolom && baris>n -kolom-1)
					array[baris][kolom] = "B";
				else if(baris>kolom && baris>n-kolom-1)
					array[baris][kolom] = "C";
				else
				array[baris][kolom] = "D";
			}
			
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
					if (array[baris][kolom]!=null)
					System.out.print(array[baris][kolom] + "\t");
					else 
						System.out.print("\t");
				}
				System.out.println("\t");
			}}
		}
}
