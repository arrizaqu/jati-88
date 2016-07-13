package com.exis.logic.hari2;

public class Soal_2 {
	public void show(int n){
	
	
	for(int i=1;i <= n ; i++){
		int z=0;
		for (int j=1 ; j <= n ;j++){
			if(i == n-j+1)
				System.out.print(z+"\t");
			else
				System.out.print("\t");
		z=z+2;
		}
			System.out.println();
		
	}
}
public static void main(String[] args) {
Soal_2 jawab = new Soal_2();
jawab.show(9);
}
}