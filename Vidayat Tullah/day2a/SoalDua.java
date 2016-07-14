package com.xsis.bt88.logic.day2a;

public class SoalDua {
	
	static void show (int x){
		int bilangan = 16;
		for (int baris = 0; baris<x; baris++){
			
			for (int kolom = 0; kolom < x; kolom++){
				if(x - baris - kolom == 0){
				System.out.print(bilangan);
				bilangan = bilangan - 2;
				} else {System.out.print(" \t");}
			}
			System.out.println(" ");
		}
		
	}
	
	public static void main (String args[]){
		show (10);
	}

}
