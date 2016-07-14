package day3;

import java.util.Scanner;

public class Soal10 {
	
	
	
	public String[] fibo(int x) {
		String[] data = new String[x + 1];
		String[] abjad = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
		
		data[0] = "1";
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= x; i++) {

			if(i % 2 == 0){ //bila ganjil memasukkan angka fibonaci yang aktif
				c = a + b;
				a = b;
				b = c;
				data[i] = String.valueOf(c);
			}else{
				data[i] = abjad[i/2];
			}
			
		}
			
		return data;
	}

	public String[][] getDataArray(int n) {
		int dimensiKolom = n;
		int dimensiBaris = n;
		int mid = n / 2;
		String[] fib = fibo(n);
		String[][] data = new String[dimensiBaris][dimensiKolom];
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
			
			String[][] data = getDataArray(n);
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
			Soal10 jawab = new Soal10();
			jawab.showing(x);
			
			s.close();
		}
}
