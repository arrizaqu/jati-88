package com.exis.logic.hari2;

public class Soal_3 {
	public void show(int n){
	
		int z1=1;
	for(int i=1;i <= n ; i++){
		int z2=0;
		for (int j=1 ; j <= n ;j++){
			if (i==j)
				System.out.print(z1+"\t");
			else if(i == n-j+1)
				System.out.print(z2+"\t");
			else
				System.out.print("\t");
		z2=z2+2;
		}
		
			System.out.println();
		z1=z1+2;
	}
}
public static void main(String[] args) {
Soal_3 jawab = new Soal_3();
jawab.show(9);
}
}