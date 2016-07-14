package com.xsis.bt88.logic.day3;


import java.util.Scanner;



public class Soal10 {
	public static void main(String args[]) {
int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
		
		(new SoalPR()).showing(n);
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
		int DimensiBaris = n;
		int DimensiKolom = n;
		int[] f=fibo(n);
		String[] aH = new String[]{"A","B","C","D","E","F","G","H","I","J"};
		int NilaiTengah=(n-1)/2;
		
	
	
		String[][] array = new String[DimensiBaris][DimensiKolom];
		int a1=0; int c1 =0;
		for(int baris = 0; baris < DimensiBaris; baris++){
			int b1=0; int d1=0;
			for(int kolom =0; kolom < DimensiKolom; kolom++){
				if((baris <= kolom && baris<=n -kolom-1 )||(baris>=kolom && baris>=n -kolom -1 ))
					{
						if(baris%2==0)
							array[baris][kolom] = String.valueOf(f[a1]);
						else
							array[baris][kolom]= aH[c1];
					}else if ((baris<=kolom&& baris>=n-kolom-1)||(baris>=kolom && baris<=n-kolom-1 ))
					{
						if(kolom%2==0)
						array[baris][kolom] = String.valueOf(f[b1]);
						else
							array[baris][kolom] = aH[d1];
					}else 
					array[baris][kolom] = "";
				if(kolom%2==0){
					if(kolom<NilaiTengah) b1++; else b1--;
				}
				else{
					if(kolom<NilaiTengah) d1++;else d1--;
				}
				if(NilaiTengah%2==1&&kolom==NilaiTengah)b1--;
				if(NilaiTengah%2==0 && kolom==NilaiTengah)d1--;	
				
				}
			if(baris%2==0){
				if(baris<NilaiTengah) a1++;else a1--;
			}
			else{
				if(baris<NilaiTengah) c1++; else c1--;
			}
			if(NilaiTengah%2 ==1 && baris==NilaiTengah)a1--;
			if(NilaiTengah%2 ==0 && baris==NilaiTengah)c1--;
					
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