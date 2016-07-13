package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal3 {
	
	
	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		int m;
		
		System.out.println("Soal3");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i==j){ 
					m = j * 2 - 1;
					System.out.print(m + "\t");
				}else if(i + j == n){
					m = j * 2 - 2;
					System.out.print(m + "\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
		s.close();
	}
	
	public static void main(String[] args) {
		Soal3 der = new Soal3();
		der.proses();
	}
}
