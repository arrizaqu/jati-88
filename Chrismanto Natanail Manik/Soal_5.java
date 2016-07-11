package com.exis.logic.hari1;

public class Soal_5 {
	public void show(int n){
	
		for(int i=1;i <= n ; i++){
			for (int j=1 ; j <= n ;j++){
				if(i >= j)
					System.out.print("*");
				else
					System.out.print(" ");
			
			}
				System.out.println();
			
		}
	}
	public static void main(String[] args) {
	Soal_5 jawab = new Soal_5();
	jawab.show(9);
	}
}
