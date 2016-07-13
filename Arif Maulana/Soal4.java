package com.xsis.bc88.logic.day2;

public class Soal4 {

	public void show_4(int n){
		int nilai_tengah_horizontal = n/2;
		for(int x=0; x < n; x++){
			int incrementNumberKolom = 1;
			int decreaseNumberKolom = 0;
			for(int y=0; y < n; y++){
				if(x==y){
					System.out.print(incrementNumberKolom + "\t");
				}
				else if (n - x - y == 1){
					System.out.print(decreaseNumberKolom + "\t");
				}
				else if(x==nilai_tengah_horizontal){
					System.out.print(decreaseNumberKolom + "\t");
				}
				else if(y==nilai_tengah_horizontal){
					System.out.print(((x)*2)+1+"\t");
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
		Soal4 jawab = new Soal4();
		jawab.show_4(9);
	}
}

