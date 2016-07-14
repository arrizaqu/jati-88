package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal_10b {
	
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
		int dimensiKolom = n;
		int dimensiBaris = n;
		Integer[] fib = fibo(n);
		String[][] data = new String[dimensiBaris][dimensiKolom];
		String[] alphbt = {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z"
		};
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {				
				for(int k = 0; k <= n / 2; k++) {
					if(kolom == k || baris == k || kolom == n - (k + 1) || baris == n - (k + 1)) {
						if(k % 2 == 0)
							data[baris][kolom] = String.valueOf(fib[k / 2]);
						else
							data[baris][kolom] = (alphbt[k / 2 % 26]);
						break;
					}
				}
			}
		}
		return data;
	};
	
	public void showing(int n) {
		
		int dimensiKolom = n;
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
		(new Soal_10b()).showing(n);
	}
}
