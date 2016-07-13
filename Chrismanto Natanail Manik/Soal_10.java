package com.exis.logic.hari2;

public class Soal_10 {
	
	public static void main(String[] args) {
		Soal_10 jawab = new Soal_10();
		jawab.show(9);
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
	public void show(int n){
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			System.out.print(fibo(i) + " ");
		System.out.print("\t");}
		System.out.println();
			}

	}
}
