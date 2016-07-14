package com.exis.logic.hari3;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Soal2 {
	public static void main(String args[]) {
		int n = 9;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			n = Integer.parseInt(br.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
		(new Soal2()).showing(n);
	}
	

	private static int fibo(int n)
	{
		int f;
		if(n<=3)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2)+fibo(n-3);
		return f;
	}
	public void showing(int n){
		
		for(int i=1;i<=n;i++){
			
			System.out.print(fibo(i) + " ");
		System.out.print("\t");}
		System.out.println();
			

	}
}
