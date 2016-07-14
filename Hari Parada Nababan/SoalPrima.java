package com.xsis.bt88.logic.day3;

import java.util.Scanner;


public class SoalPrima {
	 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int baris, a;
int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Inputan : ");
		  String input = scan.nextLine();
		  n = Integer.parseInt(input);
        for (baris = 1; baris <= n; baris++) {
            int x = 0;
            for (a = 2; a <= n; a++) {
 
                if (baris % a == 0) {
                    if (baris != a) {
                        x = 1;
                    }
                    if (x != 1 && baris == a) {
                        System.out.print(baris+" \t");
                    }
                }
            }
        }
 
    }
}
