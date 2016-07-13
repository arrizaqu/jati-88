package com.xsis.bc88.logic.day2;

import java.util.Scanner;

public class Soal10 {

	private static Scanner s;
	
	public void showing(int n){
	long fib[] = new long[n];
    
    fib[0] = 0;
    fib[1] = 1;
     
    for(int i = 2; i < n; i++) {
        fib[i] = fib[i-1] + fib[i-2];
    }
    	for (int i = 1; i < n; i++) {
    		for(int x=0; x<n; x++){
    			System.out.print(fib[i] +  "\t");
    			}
				System.out.println("\t");
    			}
    	}
    	
			
    public static void main(String[] args) {
    	s = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci: ");
        int n = s.nextInt();
        Soal10 jawab = new Soal10();
        jawab.showing(n);
        
		}
	}
