package com.exis.logic.hari3;

import java.util.Scanner;

public class Soal3 {
	public static void main (String[] args) throws Exception{

		Scanner sc = new Scanner (System.in) ;



		System.out.println(" Masukkan bilangan bulat pertama: ") ;
	

		int a = sc.nextInt();


		
		System.out.println(" Masukkan bilangan bulat kedua ") ;
		

		int b = sc.nextInt();

	
		System.out.println("KPK dari " + a + " dan " + b + " adalah " );
	
		int c = 0;

		for(int x=1;x<=b;x++) {

			c = (c + a);

			if(c % b==0) {

				System.out.println(c);

				

				}
			}
	}	
}
