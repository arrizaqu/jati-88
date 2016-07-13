package com.exis.logic.hari2;


public class Soal_1 {
public void show(int n){
		int z=1;
		
		for(int i=1;i <= n ; i++){
			for (int j=1 ; j <= n ;j++){
				if(i == j)
					System.out.print(z+"\t");
				else
					System.out.print("\t");
			
			}
				System.out.println();
			z=z+2;
		}
	}
	public static void main(String[] args) {
	Soal_1 jawab = new Soal_1();
	jawab.show(9);
	}
}


