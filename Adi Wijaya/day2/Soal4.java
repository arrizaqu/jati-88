package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal4 {

	
	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		int m;
		
		System.out.println("Soal4");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i==j){ 
					m = j * 2 - 1;
					System.out.print(m + "\t");
				}else if(i + j == n){
					m = j * 2 - 2;
					System.out.print(m + "\t");
				}else if(j == n/2){
					m = i * 2 - 1;
					System.out.print(m + "\t");
				}else if(i == n/2){
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
		Soal4 der = new Soal4();
		der.proses();
	}
}
