package com.xsis.bt88.day3;
//belom pakai array
import javax.swing.JOptionPane;

public class Soal1b {

		public void getData(int n){
			long isi[] = new long[n];
			isi[0]=0;
			isi[1]=1;
			int i;
			
			System.out.print(isi[1]+" ");
			for(i=2; i<=n; i++){
				isi[i]=isi[i-1]+isi[i-2];
				System.out.print(isi[i]+" ");
					}
			
			/* for(i=0; i<n; i++){
				System.out.print(isi[i]+" "); 
				} */
				
			}
		
		public void printData(){
			
		}
		
		public static void main (String[] args) {
			Soal1b soal = new Soal1b();
			soal.getData(Integer.valueOf(JOptionPane.showInputDialog("Masukkan angka :")));
		}
}
