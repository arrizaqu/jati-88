package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal10 {

	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("Soal10");
		for(int i=0; i<n; i++){

			for(int j=1; j<n; j++){
				if(i > 0){
					System.out.print(a + "\t");
				}else{
					System.out.print("\t");

				}		
			}
			a = a+b;
			b = a-b;
			System.out.println();

		}
		s.close();
	}
	
	public static void main(String[] args) {
		Soal10 der = new Soal10();
		der.proses();
	}
}
