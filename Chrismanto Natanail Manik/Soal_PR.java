package com.exis.logic.hari2;



public class Soal_PR {
	public static void main(String[] args) {
		Soal_PR jawab = new Soal_PR();
		jawab.show(9);
		}
	public void show(int n){
		int k = (n+1)/2;
		for(int i=1;i <= n ; i++){
			for (int j=1 ; j <= n ;j++){
				
				 if(i == n - j+1 && j<=n-k)
					System.out.print(fibo(j) + "\t");
				 else if(i==j && j>=n-k+1)
						System.out.print(fibo(n-(i-1)) + "\t");
				else if(j == k)
					System.out.print(fibo(i) + "\t");
				else
					System.out.print("\t");
			
			}
				System.out.println();
			
		}
	}

	private static int fibo(int n)
	{
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2);
		return f;
	}

}
