package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal7 {
	public String[][] setData(int n){ // Nilai Array
		String[][] data = new String[n][n];
		//code set
		int max = n-1;
		int nt = max/2;
		//Cara Fibonaci Max (Diagonal)
				int angka11=1;
				int angka22=0;//nampil duluan
				for(int i=0;i<n;i++){
					angka11=angka11+angka22;
					angka22=angka11-angka22;
				}
				//Deret Terbaliknya
				int fibmax=angka11;
				int fibshow=angka22;
				int a=1;
				int b=0;
				
		for(int y=0; y<n; y++)
		{
			
			int fibkiri1=1;
			int fibkiri2=0;
			int aa=angka11;
			int bb=angka22;
			for(int x=0; x<n; x++)
			{
				if(y+x>=max && x<=y)//bawah
				{
					data[x][y]= fibshow + "\t";
				}
				else if(y+x<=max && x>=y) //Atas
				{
					data[x][y]=a + "\t";
				}
				else if(y+x<=max && x<=y) //Kiri
				{
					data[x][y]=fibkiri1 + "\t";
				}
				else if(y+x>=max && x>=y) //Kanan
				{
					data[x][y]= bb + "\t";
				}
				fibkiri1=fibkiri1+fibkiri2;
				fibkiri2=fibkiri1-fibkiri2;
				bb=aa-bb;
				aa=aa-bb;
						
			}
			fibshow=fibmax-fibshow;
			fibmax=fibmax-fibshow;
			a=a+b;
			b=a-b;
			
		}
		return data;
	}
	
	public void showData(int n){ // Hanya menampilkan
		System.out.println("== Menampilkan data : "+ n +" ==");
		String[][] data = setData(n);
		
		for(int y=0; y<n; y++){
			for(int x=0; x<n; x++){
				if(data[x][y]==null)
				{
					data[x][y]="\t";
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
		
		Soal7 logic = new Soal7();
		logic.showData(n); // set nilai yang ditampilkan
	}
}
