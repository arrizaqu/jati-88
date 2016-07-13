package com.xsis.bt88.logic.day2;

public class Soal3 {
	public void show(int n){
		System.out.println("Soal 1");
		int a =1;
		int b =(n-1)*2;
			for(int baris = 0; baris < n; baris++){
				for(int kolom = 0; kolom < n; kolom++ ){
					if (baris==kolom)
						System.out.print(a+"\t");
					else if (n-baris-kolom == 1)
						System.out.print(b+"\t");
					else 
						System.out.print("\t");
					
				}
				System.out.println("");
				a = a+2;
				b = b-2;
				
				
			}
	}
public static void main(String[] args) {
	Soal3 jawab = new Soal3();
	jawab.show(9);
	

}
}
