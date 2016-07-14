package com.exis.logic.hari3;

import java.util.Scanner;

public class Soal5 {
	public static void main (String[] args) throws Exception{

		Scanner sc = new Scanner (System.in) ;



		System.out.println(" Masukkan bilangan bulat pertama: ") ;
	

		int a = sc.nextInt();


		
		System.out.println(" Masukkan bilangan bulat kedua ") ;
		

		int b = sc.nextInt();

	
		System.out.println("FPB dari " + a + " dan " + b + " adalah " );
	
		int d;

		d = a % b;


		while ( d != 0) {

		a = b;

		b = d;

		d = a % b;
		}

		System.out.println(b);
			
		}
	}	

