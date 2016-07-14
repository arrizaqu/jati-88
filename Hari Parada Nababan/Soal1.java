package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class Soal1
{
	public static void main(String[] args) {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
		Soal1 jawab = new Soal1();
		jawab.show(n);
		}
	public void show(int n){
		int [] array1 = new int [n];
		
		for(int baris = 2;baris < n ; baris ++)
			if(baris < 2)
				array1[baris] = 1 ;
			else 
				array1[baris] = array1[baris-1]  + array1[baris-2] ;
		for (int baris = 2; baris<n; baris++)
			System.out.print(array1[baris] + "\t");
		
	}

			
		
				
				
				 
					
			
		}
				
			

		


	
