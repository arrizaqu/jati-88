package java88logic.xsis.bootcamp88.logic.day3;

import java.util.Scanner;

public class Soal2 {

	//Array fibonacci
	public Integer[] getfibo(int x) {
		Integer[] data = new Integer[x + 1];
		for(int h = 0; h<3; h++){
			data[h]=1;
		}
		int a = 1, b = 1, c = 1, d = 0;
		
		for(int i = 3; i <= x; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
			data[i] = d;
		}
			
		return data;
	}

		
			
		//menampilkan data
		public void showing(int n){
			
			Integer[] datafib = getfibo(n);
			for(int i = 0; i<n ; i++){
					System.out.print(datafib[i] + "\t");

			}
			
		}
		
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Masukkan angka: ");
			int x = s.nextInt();
			Soal2 jawab = new Soal2();
			jawab.showing(x);
			
			s.close();
		}
}
