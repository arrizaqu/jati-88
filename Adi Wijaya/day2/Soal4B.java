package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class Soal4B {

	public Integer[][] getDataArray(int n) {
		int dimensiKolom = n;
		int dimensiBaris = n;
		int mid = n/2;
		int inc1 = 1;
		
		Integer[][] data = new Integer[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			int inc2 = 0;
			
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris == kolom){  //diagonal ke kanan
					data[baris][kolom] = inc1;
				}else if(baris + kolom == n - 1){ //diagonal ke kiri
					data[baris][kolom] = inc2;
				}else if(baris == mid){ //mendatar
					data[baris][kolom] = inc2; 
				}else if(kolom == mid){ //menurun
					data[baris][kolom] = inc1;
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
			Soal4B jawab = new Soal4B();
			jawab.showing(x);
			
			s.close();
		}
}
