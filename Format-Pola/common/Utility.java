package com.test.logic.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
	
	public static int getInputInteger(String text) throws NumberFormatException, IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print(">> "+ text);
		return Integer.parseInt(br.readLine());
	}
	
	public static void printArray2D(int nLebar, int nPanjang, String[][] array2D){
		for(int baris = 0; baris < nLebar; baris++){
			for(int kolom = 0; kolom < nPanjang; kolom++){
				System.out.print(array2D[baris][kolom] + "\t");
			}
			System.out.println("");
		}
		
	}
	
	public static long[] getFib(int n){
		int length = n;
	    long[] series = new long[length];
	    series[0] = 1;
	    series[1] = 1;
	    for (int i = 2; i < length; i++) {
	      series[i] = series[i - 1] + series[i - 2];
	    }
	    
	    return series;
	}

}
