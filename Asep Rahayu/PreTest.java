package com.xsis.bt88.day3;
import javax.swing.JOptionPane;

public class PreTest {
		
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
					if(y==0)
					{
					data[x][y]= a + " ";
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
						data[x][y]="  ";
					}
					System.out.print(data[x][y]);
				}
			}
		}
		
		public static void  main(String ars[]) 
		{ 	
			PreTest soal = new PreTest();
			soal.showData(Integer.valueOf(JOptionPane.showInputDialog("Masukkan angka :"))); // set nilai yang ditampilkan
		}

}
