package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PostTestb {
	
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

	public Integer[][] getDataArray(int n) {
		int dimensiKolom = 2 * n - 1;
		int dimensiBaris = n;
		Integer[] fib = fibo(n);
		Integer[][] data = new Integer[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {				
				if(baris == kolom || baris + kolom == 2 * (n - 1))
					data[baris][kolom] = (fib[baris]);
				else if(baris + kolom == n - 1 || baris + n - 1 == kolom)
					data[baris][kolom] = (fib[n - baris - 1]);
			}
		}
		return data;
	};
	
	public void showing(int n) {
		
		int dimensiKolom = n * 2 - 1;
		int dimensiBaris = n;
		
		Integer[][] data = getDataArray(n);
		
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(data[baris][kolom] == null)
					System.out.print(' ');
				else
					System.out.print(data[baris][kolom]);
				System.out.print('\t');
			}
			System.out.println();
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
		(new PostTestb()).showing(n);
	}
}
