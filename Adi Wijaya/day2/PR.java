package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class PR {

	
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
		int mid = n / 2;
		Integer[] fib = fibo(n);
		Integer[][] data = new Integer[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris == kolom && baris > mid)
					data[baris][kolom] = (fib[n - baris - 1]);
				else if(baris + kolom == n - 1 && baris > mid)
					data[baris][kolom] = (fib[n - baris - 1]);
				else if(kolom == mid)
					data[baris][kolom] = (fib[baris]);
			}
		}
		return data;
	}
		
			
		//menampilkan data
		public void showing(int n){
			int dimensiBaris = n;
			int dimensiKolom = n;
			
			Integer[][] data = getDataArray(n);
			for(int baris = 0; baris<dimensiBaris ; baris++){
				for(int kolom = 0; kolom<dimensiKolom ; kolom++){
					if(data[baris][kolom] != null){
						System.out.print(data[baris][kolom] + "\t");
					}else{
						System.out.print(" \t");
					}
				}
				System.out.println();
			}
			
		}
		
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Masukkan angka: ");
			int x = s.nextInt();
			PR jawab = new PR();
			jawab.showing(x);
			
			s.close();
		}
}
