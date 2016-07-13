package com.xsis.bc88.logic.day2;

public class Soal7 {

	public void show_7(int n){
		for(int x=0; x < n; x++){
			int incrementNumberKolom = 1;
			int decreaseNumberKolom = 0;
			for(int y=0; y < n; y++){
				if(x==y){
					System.out.print(incrementNumberKolom + "\t");
				}
				else if(n-x-y==1){
					System.out.print(decreaseNumberKolom + "\t");
				}
				else if (x <= y && x + y <= n - 1){
					System.out.print("A\t");
				}
				else if (x >= y && x + y >= n - 1) {
					System.out.print("B\t");
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
		Soal7 jawab = new Soal7();
		jawab.show_7(9);
	}
}
