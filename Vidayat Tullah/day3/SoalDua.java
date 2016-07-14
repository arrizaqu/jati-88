package com.xsis.bt88.logic.day3;

public class SoalDua {
	
static void show (int x){
		String dataString = new String("Testt");
		System.out.println(dataString);
		for (int baris = 1; baris <= 1; baris++){
			int a = 1;
			int b = 1;
			for (int kolom = 1; kolom < x; kolom++){
				if(baris == kolom){
					System.out.print( "1 \t 1 \t");
				}else{
						System.out.print(a + " \t");
						a = a +b;
						b = a - b;
				}
				}
			System.out.println("");
			}
			
		
	}
	
	public static void main(String args[]){
		show (10);
		
	}

}
