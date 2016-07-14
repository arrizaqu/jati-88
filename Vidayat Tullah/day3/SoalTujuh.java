package com.xsis.bt88.logic.day3;
import java.util.Scanner;

public class SoalTujuh {
	
	
	private static Scanner s;
	//fibonacci
	public long[] getFib(int n){
		long[] series = new long[n];
		//create first 2 series elements
        series[0] = 1;
        series[1] = 1;
       
        //create the Fibonacci series and store it in an array
        for(int i=2; i < n; i++){
                series[i] = series[i-1] + series[i-2];
        }
        return series;
	}
	
	static void show(int n){
		
		for (int baris = 0; baris < n; baris++){
			for(int kolom = 0; kolom < n; kolom++){
				if(baris == 0 && baris < kolom){
					System.out.print("1 \t");
				}
				else if(baris == 1 && baris + kolom <n){
					System.out.print("1 \t");
					
				}
				else if(baris == 2 && baris + kolom <= n - 6){
					System.out.print("1 \t");
					
				}
				else if(baris == 2 && baris + kolom <= n - 2){
					System.out.print("2 \t");
					
				}
				else if(baris == 2 && baris + kolom <= n){
					System.out.print("1 \t");
					
				}
				else if(baris == 3 && baris + kolom <= n - 5){
					System.out.print("1 \t");
					
				}
				else{
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
		
		show(9);
		
	}

}
