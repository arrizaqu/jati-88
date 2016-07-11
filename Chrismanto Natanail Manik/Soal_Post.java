package com.exis.logic.hari1;

public class Soal_Post {

		public void show(int n){
			int k = (n+1)/2;
			for(int i=1;i <= n ; i++){
				for (int j=1 ; j <= n ;j++){
					if(i==j && j>=n-k+1)
						System.out.print("*");
					else if(i == n - j+1 && j<=n-k)
						System.out.print("*");
					
					else if(j == k)
						System.out.print("*");
					else
						System.out.print(" ");
				
				}
					System.out.println();
				
			}
		}
		public static void main(String[] args) {
		Soal_Post jawab = new Soal_Post();
		jawab.show(9);
		}
}
