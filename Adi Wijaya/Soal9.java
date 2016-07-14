package java88logic.xsis.bootcamp88.logic.day3;

import java.util.Scanner;

public class Soal9 {
	
	public Integer[] fibo(int x) {
		Integer[] data = new Integer[x + 1];
		data[0] = 1;
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= x; i++) {

			if(i % 2 == 0){ //bila ganjil memasukkan angka fibonaci yang aktif
				c = a + b;
				a = b;
				b = c;
				data[i] = c;
			}
			
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
				//if(baris == kolom || baris == n - (baris+1) || kolom == n - (kolom+1) ){
					if(baris == kolom && baris<=mid){ // garis diagonal kiri atas
						data[baris][kolom] = (fib[baris]);
					}else if(baris + kolom == n - 1 && baris < mid){ // garis diagonal kanan atas
						data[baris][kolom] = (fib[n - kolom - 1]);
					}else if(baris == kolom && baris > mid){	// garis diagonal kanan bawah
						data[baris][kolom] = (fib[n - baris - 1]);
					}else if(baris + kolom == n - 1 && baris > mid){ // garis diagonal kiri bawah
						data[baris][kolom] = (fib[n - baris - 1]);
					}else if(baris < kolom && baris + kolom < n - 1){ // bagian atas
						data[baris][kolom] = (fib[baris]);
					}else if(baris < kolom && baris + kolom > n - 1){ // bagian kanan
						data[baris][kolom] = (fib[n - kolom - 1]);
					}else if(baris > kolom && baris + kolom > n - 1){ // bagian bawah
						data[baris][kolom] = (fib[n - baris - 1]);
					}else if(baris > kolom && baris + kolom < n - 1){ // bagian kiri
						data[baris][kolom] = (fib[kolom]);
					}
				//}
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
			Soal9 jawab = new Soal9();
			jawab.showing(x);
			
			s.close();
		}
}
