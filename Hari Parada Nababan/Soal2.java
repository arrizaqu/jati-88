package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class Soal2 {
	
	
public static void main(String[] args) {
	int n = 0;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Masukan Inputan : ");
	  String input = scan.nextLine();
	  
	  n = Integer.parseInt(input);
		Soal2 jawab = new Soal2();
		jawab.show(n);
		}
	public void show(int n){
		int [] array1 = new int [n];
		
		for(int baris=0;baris < n ; baris++)
			if(baris < 3)
				array1[baris] = 1;
			else 
				array1[baris] = array1[baris-1]  + array1[baris-2] + array1[baris-3] ;
		for (int baris = 0; baris<n; baris++)
			System.out.print(array1[baris] + "\t");
			
			
		
				
				
				 
					
			
		}
				
			
}