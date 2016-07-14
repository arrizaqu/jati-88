package com.xsis.bt88.logic.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal9 {
	
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
						if(k % 2 == 0)
							data[baris][kolom] = fib[k / 2];
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
		
		Integer[][] data = getDataArray(n);
		
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(data[baris][kolom] == null)
					System.out.print(' ');
				else
					System.out.print(data[baris][kolom]);
				System.out.print(' ');
			}
			System.out.println();
		} 
	}
	
	
	public static void main(String args[]) {
		Soal9 jawab = new Soal9();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.print("Input number : ");
			int angka = Integer.parseInt(br.readLine());
			jawab.showing(angka); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
