package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal1B {

	public Integer[][] getDataArray(int n) {
		int dimensiKolom = n;
		int dimensiBaris = n;
		int inc = -1;
		Integer[][] data = new Integer[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			inc = inc + 2;
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris == kolom){
					data[baris][kolom] = inc;
				}
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
			Soal1B jawab = new Soal1B();
			jawab.showing(x);
			
			s.close();
		}
}
