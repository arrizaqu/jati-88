package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class Soal5 {
	
		static int getFPB(int x, int y){
			if (x>y){ //cek apakah x lebih besar dari y
				if(x % y == 0){ //jika sisa bagi x dan y adalah 0
					return y; //FPB = y
			}
			else{ //jika sisa bagi x dan y tidak 0
				return getFPB(y, x % y); //fungsi rekursif
			}
		}
			else{ //jika x tidak lebih besar dari y
				if(y % x == 0){ //jika sisa bagi y dan x adalah 0
					return x; //FPB - x
				}
				else{ //jika sisa bagi y dan x tidak 0
					return getFPB(x, y %x);
				}
			}
			
		}
		
	public static void main(String[] args) {
		int a;
		int b;
		Scanner in = new Scanner(System.in);		
		try{
			System.out.print("Angka 1 : ");
			a = in.nextInt();in.nextLine();
			System.out.print("Angka 2 : ");
			b = in.nextInt();in.nextLine();
			System.out.println(getFPB(a, b));
		}finally{
			in.close();
		}
	}
}