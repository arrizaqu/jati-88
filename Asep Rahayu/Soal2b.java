package com.xsis.bt88.day3;
//Belom pakai arrays
import javax.swing.JOptionPane;

	public class Soal2b {

			public void getData(int n){
				long [] isi = new long[n];
				isi[0]=1;
				isi[1]=1;
				isi[2]=1;
				int i;
				
				System.out.print(isi[0]+" ");
				System.out.print(isi[1]+" ");
				System.out.print(isi[2]+" ");
				for(i=3; i<=n; i++){
					isi[i]=isi[i-1]+isi[i-2]+isi[i-3];
					System.out.print(isi[i]+" ");
						}
				
				/* for(i=0; i<n; i++){
					System.out.print(isi[i]+" "); 
					} */
					
				}
			
			public void printData(){
				
			}
			
			public static void main (String[] args) {
				Soal2b soal = new Soal2b();
				soal.getData(Integer.valueOf(JOptionPane.showInputDialog("Masukkan angka :")));
			}
}
