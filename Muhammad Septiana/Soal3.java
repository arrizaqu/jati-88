package day3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Soal3 {
	public String[][]setDataArray(int n)
	{
		int dimensiBaris = 1;
		int dimensiKolom = n;
		String[][] data = new String[dimensiBaris][dimensiKolom];
		
		return data;
	}
	public ArrayList<Integer> getBilanganPrima(int n)
	{
		int dimensiBaris =n;
		int cekPrima ;
		
		ArrayList<Integer> deretPrima = new ArrayList<Integer>();
		
		for(int baris =0;baris < dimensiBaris;baris++ )
		{	
			cekPrima = baris;
			if(cekPrima %2 !=0)
			{
							
				for(int deret=2;deret<cekPrima;deret++) {
			        if(cekPrima%deret!=0)
			        {
			           deretPrima.add(cekPrima);
			           deret = cekPrima;
			    
			        }
				}
			}
		}
		return deretPrima;
	}
	
	
	
	public void proses(int n)
	{
		int dimensiBaris =1;
		int dimensiKolom =n;
		String[][] data = setDataArray(n);
		ArrayList<Integer> deretP = getBilanganPrima(n); 
		//tampilin bilangan prima
		int baris =1;
		for(baris =0 ;baris <dimensiBaris;baris++)
		{
			for(int kolom = 0; kolom <deretP.size();kolom++)
			{	
				data[baris][kolom]=Integer.toString(deretP.get(kolom));
				System.out.print(data[baris][kolom]+"\t");
		
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal3 jawab = new Soal3();// membuat method untuk dipanggil
		jawab.proses(n);// method yang dipanggil
	}
}
