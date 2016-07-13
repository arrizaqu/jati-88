package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal2 {
	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		
		
		System.out.println("Soal2");
		for(int i=1; i<n; i++){
			int m = 0;
			for(int j=1; j<n; j++){
				if(i+j==n){ //kondisi untuk garis (jika nomor baris ditambah nomor kolom sama dengan nilai n/nilai max)
					System.out.print(m + "\t"); 
				}else{
					System.out.print(" \t");
				}
				m = m + 2;
			}
			System.out.println();
		}
		s.close();
	}
	
	public static void main(String[] args) {
		Soal2 der = new Soal2();
		der.proses();
	}
}
