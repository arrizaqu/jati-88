package com.xsis.bt88.day3;

public class Soal_6b {
	
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
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				
				if(baris == kolom)
					data[baris][kolom] = (String.valueOf(fib[baris]));
				else if(baris + kolom == n - 1) 
					data[baris][kolom] = (String.valueOf(fib[n - baris - 1]));
				else if(baris > kolom && baris + kolom > n - 1)
					data[baris][kolom] = "C";
				else if(baris < kolom && baris + kolom < n - 1)
					data[baris][kolom] = "A";
				else if(baris > kolom && baris + kolom < n - 1)
					data[baris][kolom] = "D";
				else if(baris < kolom && baris + kolom > n - 1)
					data[baris][kolom] = "B";
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
				System.out.print(data[baris][kolom] + '\t');
			}
			System.out.println();
		} 
	}
	
	
	public static void main(String args[]) {
		(new Soal_6b()).showing(9);
	}
}
