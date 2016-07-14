package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal6 {
	
	public String[][] setData(int n){ // Nilai Array
		String[][] data = new String[n][n];
		//code set
		int max = n-1;
		int nt = max/2;
		
		for(int y=0; y<n; y++)
		{
			int a=1;
			int b=0;
			for(int x=0; x<n; x++)
			{
				if(y==x)
				{
					data[x][y]=a + "\t";
				}
				else if(y+x==max)
				{
					data[x][y]= a + "\t";
				}
				else if ((y<x) && (x<n-y-1))
				{
					data[x][y]="A \t";
				}
				else if ((y>x) && (x>n-y-1))
				{
					data[x][y]="C \t";
				}
				else if (y<x){
					data[x][y]="B \t";
				}
				a=a+b;
				b=a-b;
			}
			
		}
		return data;
	}
	
	public void showData(int n){ // Hanya menampilkan
		String[][] data = setData(n);
		
		for(int y=0; y<n; y++){
			for(int x=0; x<n; x++){
				if(data[x][y]==null)
				{
					data[x][y]="D\t";
				}
				System.out.print(data[x][y]);
			}
			System.out.println("");
		}
	}
	
	public static void  main(String ars[])throws Exception
	{ 
		InputStreamReader nilai = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(nilai);
		System.out.println("Masukan Angka : ");
		String angka = br.readLine();
		int n = Integer.parseInt(angka);
		
		Soal6 soal = new Soal6();
		soal.showData(n); // set nilai yang ditampilkan
	}
}
