package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal9 {

	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		
		System.out.println("Soal9");
		for(int i=1; i<n; i++){
			int a = 1;
			int b = 1;
			for(int j=1; j<n; j++){
				if(j == 1){
					System.out.print("1\t");
				}else{
					System.out.print(a + "\t");
					a = a+b;
					b = a-b;
				}		
			}
			System.out.println();
		}
		s.close();
	}
	
	public static void main(String[] args) {
		Soal9 der = new Soal9();
		der.proses();
	}
}
