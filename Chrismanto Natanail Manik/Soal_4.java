package com.exis.logic.hari2;
	
public class Soal_4 {

public void show(int n){
	int k = (n+1)/2;
	int z = 1;
		
	for(int i=1;i <= n ; i++){
		int z2=0;
		for (int j=1 ; j <= n ;j++){
			
			if(i==j|| j==k)
				System.out.print(z+"\t");
			else if(i == n - j+1||(i==k))
				System.out.print(z2+"\t");
			
			else
				System.out.print("\t");
			z2=z2+2;
		}
			System.out.println("\n");
			z=z+2;
		
	}
}
public static void main(String[] args) {
Soal_4 jawab = new Soal_4();
jawab.show(9);
}
}
