package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal_1b {
	
	public Integer[] fibo(int x) {
		Integer[] data = new Integer[x + 1];
		data[0] = 1;
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= x; i++) {
			c = a + b;
			a = b;
			b = c;
			data[i] = c;
		}
			
		return data;
	}
	
	public void showing(int n) {
		
		int dimensiBaris = n;
		
		Integer[] data = fibo(n);
		
		for(int baris = 0; baris < dimensiBaris; baris++) {
			System.out.print(data[baris]);
			System.out.print('\t');
		} 
	}
	
	
	public static void main(String args[]) {
		int n = 9;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			n = Integer.parseInt(br.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
		(new Soal_1b()).showing(n);
	}
}
