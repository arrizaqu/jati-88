package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal7B {

	public String[][] getDataArray(int n) {
		int dimensiKolom = n;
		int dimensiBaris = n;
		int inc1 = -1;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			int inc2 = -2;
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris==kolom){
					data[baris][kolom] = String.valueOf(inc1);
				}else if(baris+kolom==n - 1){
					data[baris][kolom] = String.valueOf(inc2);
				}else if(baris <= kolom && baris + kolom <= n-1){
					data[baris][kolom] = "A";
				}else if(baris >= kolom && baris + kolom >= n){
					data[baris][kolom] = "B";
				}

				inc2 = inc2 + 2;
			}
			inc1 = inc1 + 2;
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
			Soal7B jawab = new Soal7B();
			jawab.showing(x);
			
			s.close();
		}
}

