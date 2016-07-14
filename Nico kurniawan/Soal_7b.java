package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal_7b {
	
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
		int dimensiKolom = n;
		int dimensiBaris = n;
		Integer[] fib = fibo(n);
		Integer[][] data = new Integer[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				
				for(int k = 0; k <= n / 2; k++) {
					if(kolom == k || baris == k || kolom == n - (k + 1) || baris == n - (k + 1)) {
						data[baris][kolom] = fib[k];
						break;
					}
				}
//				if(kolom == 0 || baris == 0 || kolom == n - 1 || baris == n - 1)
//					data[baris][kolom] = fib[0];
//				else if(kolom == 1  || baris == 1 || kolom == n - 2 || baris == n - 2)
//					data[baris][kolom] = fib[1];
//				else if(kolom == 2  || baris == 2 || kolom == n - 3 || baris == n - 3)
//					data[baris][kolom] = fib[2];
//				else if(kolom == 3  || baris == 3 || kolom == n - 4 || baris == n - 4)
//					data[baris][kolom] = fib[3];
//				else if(kolom == 4  || baris == 4 || kolom == n - 5 || baris == n - 5)
//					data[baris][kolom] = fib[4];
			}
		}
		return data;
	};
	
	public void showing(int n) {
		
		int dimensiKolom = n;
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
		(new Soal_7b()).showing(n);
	}
}
