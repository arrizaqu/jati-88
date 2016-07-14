package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class SoalFPB {
	   public static int fpb(int x, int y){
		      return (y == 0) ? x : fpb (y, x % y);
		   }
	   public static void main(String[] args) {
		    
		   int x;
			int y;
			int hasil;
			
			
			
			Scanner input = new Scanner(System.in);
			System.out.println("masukkan bilangan pertama : ");

			x=input.nextInt();

			System.out.println("masukkan bilangan kedua : ");
			y=input.nextInt();
			hasil = fpb(x, y);
			
			System.out.println("FPB dari " + Integer.toString(x) +  " dan " +  
				    Integer.toString(y) + " adalah " + Integer.toString(hasil) );

	}

}
