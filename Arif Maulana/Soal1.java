package com.xsis.bc88.logic.day2;


public class Soal1 {

	public void show_1(int n){
		
		for(int x=0; x < n; x++){
			int incrementNumberKolom = 1;
			for(int y=0; y < n; y++){
				if (x==y)
				{
				System.out.print(incrementNumberKolom + " \t");
				}
				else
				{ 
				System.out.print("\t");
				}
				incrementNumberKolom = incrementNumberKolom + 2;
			}
			System.out.println("\t");
			
		}
	
	}
	
	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		jawab.show_1(9);
	}
}
