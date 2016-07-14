package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal_2b {
	
	public Integer[] fibo(int x) {
		
		Integer[] data = new Integer[x + 1];
		data[0] = 1;
		data[1] = 1;
		data[2] = 1;
		int a = 1, b = 1, c = 1, d = 0;
		
		for(int i = 3; i <= x; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
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
		(new Soal_2b()).showing(n);
	}
}
