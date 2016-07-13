package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal7 {

	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		int o = -1;
		
		System.out.println("Soal7");
		for(int i=1; i<n; i++){
			int m = 0;
			o = o + 2;
			for(int j=1; j<n; j++){
				if(i==j){
					System.out.print(o + "\t");
				}else if(i+j==n){
					System.out.print(m + "\t");
				}else if(i <= j && i + j <= n - 1){
					System.out.print("A\t");
				}else if(i >= j && i + j >= n){
					System.out.print("B\t");
				}else{
					System.out.print("\t");
				}
				
				m = m + 2;
			}
			System.out.println();
			
		}
		s.close();
	}
	
	public static void main(String[] args) {
		Soal7 der = new Soal7();
		der.proses();
	}
}
