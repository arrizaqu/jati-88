package com.xsis.bt88.day3;

import javax.swing.JOptionPane;

	public class Soal4b {

	        public String[] setData(int n){ // Nilai Array
				String[] data = new String[n];
				//code set
				int x,y;
				
				for(y=0; y<n; y++)
				{ int a=0;
					for(x=2; x<=y; x++)
					{
						if(x%y==0)
						{ if(x!=y)
						 data[x]= 1+" ";
						}
						if ((x==y) && (a!=1)) {
						 data[x]=x+" ";
						}
					}
					
				}
				return data;
			}
			
			public void showData(int n){ // Hanya menampilkan
				String[] data = setData(n);
				
				for(int y=0; y<n; y++){
					for(int x=0; x<n; x++){
						if(y==0)
						{
							System.out.print(data[x]+" ");
						}
						if(data[x]==null)
						{
							data[x]="";
						}
						
					}
				}
		}
	            
			public static void  main(String ars[]) 
			{ 	
				Soal4b soal = new Soal4b();
				soal.showData(Integer.valueOf(JOptionPane.showInputDialog("Masukkan angka :"))); // set nilai yang ditampilkan
			}
	         
}
 