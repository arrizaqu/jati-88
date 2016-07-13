package com.xsis.bc88.logic.day2;


public class Soal6 {

	public void show_6(int n){
		for(int x=0; x < n; x++){
			int decreaseNumberKolom = 0;
			for(int y=0; y < n; y++){
				if (n - x - y ==1){
					System.out.print(decreaseNumberKolom + "\t");
				}
				else if(n - x <= y){
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
		Soal6 jawab = new Soal6();
		jawab.show_6(9);
	}
}
