package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal8 {
	public String[][] setData(int n){ // Nilai Array
		String[][] data = new String[n][n];
		//code set
		int max = n-1;
		int nt = max/2;

		int b=1;
		int c=n;
		for(int y=0; y<n; y++)
		{
			int a=1;
			int d=n;
			for(int x=0; x<n; x++)
			{
				
				if(y+x>=max && x<=y)//bawah
				{
					if (y%2==0){
						data[x][y]=c + "\t";
					}
						
				}
				else if(y+x<=max && x>=y) //Atas
				{
					if (y%2==0){
						data[x][y]=b + "\t";
					}
				}
				else if(y+x<=max && x<=y) //Kiri
				{
					if (x%2==0){
						data[x][y]=a + "\t";
					}
				}
				else if(y+x>=max && x>=y && x%2==0) //Kanan
				{
					data[x][y]= d + "\t";
				}
				d--;
				a++;
			}	
			b++;
			c--;
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
		
		Soal8 soal = new Soal8();
		soal.showData(n); // set nilai yang ditampilkan
	}
}
