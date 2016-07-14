package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRb {
	
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

	public String[][] getDataArray(int n) {
		int dimensiKolom = 2 * n - 1;
		int dimensiBaris = n;
		int mid = n / 2;
		String[] alphbt = {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z"
		};
		Integer[] fib = fibo(n);
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {				
				if(baris == kolom || baris + kolom == 2 * (n - 1))
					data[baris][kolom] = String.valueOf(fib[baris]);
				else if(baris + kolom == n - 1 || baris + n - 1 == kolom)
					data[baris][kolom] = String.valueOf(fib[n - baris - 1]);
				else if(baris == mid){
					if(kolom < mid)
						data[baris][kolom] = alphbt[kolom % 26];
					else if(kolom < n)
						data[baris][kolom] = alphbt[(kolom - 1) % 26];
					else if(kolom < mid + n)
						data[baris][kolom] = alphbt[(2 * (n - 1) - kolom - 1) % 26];
					else
						data[baris][kolom] = alphbt[(2 * (n - 1) - kolom) % 26];
				}
			}
		}
		return data;
	};
	
	public void showing(int n) {
		
		int dimensiKolom = n * 2 - 1;
		int dimensiBaris = n;
		
		String[][] data = getDataArray(n);
		
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
		(new PRb()).showing(n);
	}
}
