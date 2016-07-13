package com.xsis.bt88.logic.day2;

public class Soal9 {
	
	

	private static int derFibo(int n)
	{
		int fibo;
		if(n==1 || n==2)
			fibo=1;
		else
			fibo = derFibo(n-1) + derFibo(n-2);
		return fibo;
	}
	public void show(int n){
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			System.out.print(derFibo(j) + " ");
		System.out.print("\t");}
		System.out.println();
			}
		

	}
	public static void main(String[] args) {
		Soal9 jawab = new Soal9();
		jawab.show(9);
		}
}





