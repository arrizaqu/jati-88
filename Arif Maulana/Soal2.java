package com.xsis.bc88.logic.day3;

import java.util.Scanner;

public class Soal2 {

	private static Scanner s;


	public long[] getFib(int n){
		long[] series = new long[n];
		//create first 3 series elements
        series[0] = 1;
        series[1] = 1;
        series[2] = 1;
       
        //create the Fibonacci series and store it in an array
        for(int i=3; i < n; i++){
                series[i] = series[i-1] + series[i-2] + series[i-3];
        }
        return series;
	}
	
	//set data => return array
	public String[] getDataArray(int n){
		//code
		int dimensiBaris = n;
		long[] dataFib = getFib(n);
		
		String[] data = new String[dimensiBaris];
		for(int baris = 0; baris < dimensiBaris; baris++){
					data[baris] = String.valueOf(dataFib[baris]);
				}
		return data;
		}
						
	//menampilkan data => menampilkan array
	public void showing(int n){
		int dimensiBaris = n;
		
		String[] data = getDataArray(n);
		for(int baris = 0; baris < dimensiBaris; baris++){
				System.out.print(data[baris] + "\t");
				}
				System.out.println("");
		}
			
		public static void main(String[] args) {
			s = new Scanner(System.in);
			System.out.println("masukan angka :");
			int n = s.nextInt();
			Soal2 jawab = new Soal2();
			jawab.showing(n);
		}
	}