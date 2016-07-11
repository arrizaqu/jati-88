package com.exis.logic.hari1;

public class Soal_7 {
public void show(int n){
		
		for(int i=1;i <= n ; i++){
			for (int j=1 ; j <= n ;j++){
				if (i <= j && i <= n - j + 1)
					System.out.print("*");
				else if(i >= j && i >= n - j + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			
			}
				System.out.println();
			
		}
	}
	public static void main(String[] args) {
	Soal_7 jawab = new Soal_7();
	jawab.show(9);
	}

}
