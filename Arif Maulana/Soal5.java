package com.xsis.bc88.logic.day2;

public class Soal5 {

	public void show_5(int n){
		for(int x=0; x< n; x++){
			int incrementNumberKolom = 1;
			for(int y=0; y< n; y++){
				if (x==y){
					System.out.print(incrementNumberKolom + "\t");
				}
				else if(x<y){
					System.out.print("\t");
				}
				else
				{ 
				System.out.print(incrementNumberKolom + "\t");
				}
				incrementNumberKolom = incrementNumberKolom + 2;
			}
			System.out.println("\t");
		}
	
	}
	public static void main(String[] args) {
		Soal5 jawab = new Soal5();
		jawab.show_5(9);
	}
	
}
