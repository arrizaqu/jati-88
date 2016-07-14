package java88logic.xsis.bootcamp88.logic.day3;

import java.util.Scanner;

public class PreTest {

	//array fibo
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

		
			
		//menampilkan data
		public void showing(int n){
			
			Integer[] data = fibo(n);
			for(int i = 0; i<n ; i++){
				if(data[i] != null){
					System.out.print(data[i] + "\t");
				}else{
					System.out.print(" \t");
				}
			}
			
		}
		
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Masukkan angka: ");
			int x = s.nextInt();
			PreTest jawab = new PreTest();
			jawab.showing(x);
			
			s.close();
		}
}
