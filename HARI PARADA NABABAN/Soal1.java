package com.xsis.bt88.logic.day2;



public class Soal1 {
	public void show(int n){
		System.out.println("Soal 1");
		int a =1;
			for(int baris = 1; baris <= n; baris++){
				for(int kolom = 1; kolom <= n; kolom++ ){
					if (baris==kolom)
						System.out.print(a+"\t");
					else 
						System.out.print("\t");
					
				}
				System.out.println("");
				a = a+2;
				
				
			}
	}
public static void main(String[] args) {
	Soal1 jawab = new Soal1();
	jawab.show(9);
	

}
}
