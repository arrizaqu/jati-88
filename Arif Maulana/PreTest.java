package com.xsis.bc88.logic.day2;

public class PreTest {

public void show(int n){
		
		for(int x=0; x < n; x++){
			int incrementNumberKolom = 1;
			int decreaseNumberKolom = 1;
			for(int y=0; y < n; y++){
				if (x==y){
					System.out.print(incrementNumberKolom + "\t");
				}
				else if (n - x - y == 1){
					System.out.print(decreaseNumberKolom + "\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				incrementNumberKolom = incrementNumberKolom + 2;
				decreaseNumberKolom = decreaseNumberKolom + 2;
			}
			System.out.println("\t");
		}
	
	}
	
	public static void main(String[] args) {
		PreTest jawab = new PreTest();
		jawab.show(9);
	}
}
