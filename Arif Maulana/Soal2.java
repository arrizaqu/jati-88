package com.xsis.bc88.logic.day2;


public class Soal2 {

	public void show_2(int n){
		
		for(int x=0; x < n; x++){
			int decreaseNumberKolom = 0;
			for(int y=0; y< n; y++){
				if (n - x - y == 1){
					System.out.print(decreaseNumberKolom + "\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				decreaseNumberKolom = decreaseNumberKolom + 2;
			}
			System.out.println("\t");
		}
	
	}


	public static void main(String[] args) {
		Soal2 jawab = new Soal2();
		jawab.show_2(9);
	}
}
