package java88logic.xsis.bootcamp88.logic.day3;

import java.util.Scanner;


public class Soal6 {

	//Array fibonacci
	public Integer[] getFibo(int x) {
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
		int inc1 = 1;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++) {
			int inc2 = 1;
			for(int kolom = 0; kolom < dimensiKolom; kolom++) {
				if(baris==kolom){
					data[baris][kolom] = String.valueOf(inc1);
				}else if(baris + kolom == n -1){
					data[baris][kolom] = String.valueOf(inc2);
				}else if(baris < kolom && baris + kolom < n - 1){
					data[baris][kolom] = "A";
				}else if(baris < kolom && baris + kolom > n - 1){
					data[baris][kolom] = "B";
				}else if(baris > kolom && baris + kolom > n - 1){
					data[baris][kolom] = "C";
				}else if(baris > kolom && baris + kolom < n - 1){
					data[baris][kolom] = "D";
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
		Soal6 jawab = new Soal6();
		jawab.showing(x);
		
		s.close();
	}
}
