package com.xsis.bt88.day3;


import javax.swing.JOptionPane;

public class Soal2 {
		
		public Integer[] setData(int n){ // Nilai Array
			Integer[] data = new Integer[n];
			//code set
			
			for(int y=0; y<n; y++)
			{
				for(int x=0; x<n; x++)
				{
					if(x<3)
					{
					data[x]= 1;
					}
					else {
						data[x] = data[x-1] + data[x-2] + data[x-3]; 
					}
				}
				
			}
			return data;
		}
		
		public void showData(int n){ // Hanya menampilkan
			Integer[] data = setData(n);
			
			for(int y=0; y<n; y++){
				for(int x=0; x<n; x++){
					if(y==0)
					{
						System.out.print(data[x]+" ");
					}
					
				}
			}
		}
		
		public static void  main(String ars[]) 
		{ 	
			Soal2 soal = new Soal2();
			soal.showData(Integer.valueOf(JOptionPane.showInputDialog("Masukkan angka :"))); // set nilai yang ditampilkan
		}
}