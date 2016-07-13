package java88logic.xsis.bootcamp88.logic.day2;

import java.util.Scanner;

public class PostTest {

	public void proses(){
		Scanner s = new Scanner(System.in);
		System.out.print("masukkan angka: ");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("PostTest");
		for(int i=0; i<n; i++){
			for(int j=1; j<n; j++){
				if(i>0){
					if(i==j && i>5){ 
						System.out.print(a + "\t");
					}else if(i + j == n && i > 5){
						System.out.print(a + "\t");
					}else if(j == n/2){
						System.out.print(a + "\t");
					}else{
						System.out.print(" \t");
					}
					}else{
						System.out.print(" \t");
				}
			}
			a = a + b ;
			b = a - b;
			System.out.println();
		}
		s.close();
	}
	
	public static void main(String[] args) {
		PostTest der = new PostTest();
		der.proses();
	}
}
