package java88logic.xsis.bootcamp88.logic.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal_4 {
	
	public Integer[] prime(int x) {
		
		
		Integer[] data = new Integer[x + 1];
		data[0] = 2;
		
		int y = 1;
		int a = 3;
		boolean prime = true;
		int i = 2;
		for(;y <= x;) {
			prime = true;
			i = 2;
			for(; i < a; i++)
				if(a % i == 0) {
					prime = false;
					break;
				}
			a++;
			if(prime){
				data[y++] = i;
			}
		}
			
		return data;
	}
	
	public void showing(int n) {
		
		int dimensiBaris = n;
		
		Integer[] data = prime(n);
		
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
		(new Soal_4()).showing(n);
	}
}
