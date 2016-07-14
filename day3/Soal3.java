package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class Soal3 {
		
	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);

		int a;
		int b;
		int c;
		int fpb;
		int kpk;
		int x;
		
		try{
			System.out.print("masukkan dua buah angka: ");
			a = baca.nextInt();
				baca.nextLine();

			System.out.print(" dan ");
			b = baca.nextInt();
				baca.nextLine();


			x = a * b;
			do
			{
				c = a % b;
				a = b;
				b = c;
			}
			while (b != 0);

			fpb = a;
			kpk = x / fpb;
			System.out.println("\nkpk = "+kpk);
			
	}finally{
		baca.close();
	}
}
}