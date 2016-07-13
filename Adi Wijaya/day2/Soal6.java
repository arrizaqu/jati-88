package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal6 {

	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		
		
		System.out.println("Soal6");
		for(int i=1; i<n; i++){
			int m = 0;
			for(int j=1; j<n; j++){
				if(i+j<=n-1){
					System.out.print("\t");
				}else{
					System.out.print(m + "\t");
				}
				
				m = m + 2;
			}
			System.out.println();
		}
		s.close();
	}

	
	public static void main(String[] args) {
		Soal6 der = new Soal6();
		der.proses();
	}
}
