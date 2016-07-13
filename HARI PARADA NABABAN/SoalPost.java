package com.xsis.bt88.logic.day2;

public class SoalPost {
	public static void main(String[] args) {
		SoalPost jawab = new SoalPost();
		jawab.show(9);
		}
	public void show(int n){
		int nilaiTengah = (n+1)/2;
		for(int baris=1;baris <= n ; baris++){
			for (int kolom=1 ; kolom <= n ;kolom++){
				if(baris==kolom && kolom>=n-nilaiTengah+1)
					System.out.print(fibo(baris) + "\t");
				else if(baris == n - kolom+1 && kolom<=n-nilaiTengah)
					System.out.print(fibo(baris) + "\t");
				
				else if(baris == nilaiTengah)
					System.out.print(fibo(baris) + "\t");
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
		
		
	}}
