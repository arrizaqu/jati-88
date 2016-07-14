package com.xsis.bt88.logic.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal1 {
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
		
		//set data => return array
		public String[] getDataArray(int n){
			//code
			int dimensiKolom = n;
			long[] dataFib = getFib(n);
			
			String[] data = new String[dimensiKolom];
				for(int kolom = 0; kolom < dimensiKolom; kolom++){
					if(kolom <= n){
						data[kolom] = String.valueOf(dataFib[kolom]);
					}
					else{
						data[kolom] = "";
					}
				}
			return data;	
		}
				
		//menampilkan data => menampilkan array
		public void show(int n){
			int dimensiKolom = n;
			
			String[] data = getDataArray(n);
				for(int kolom = 0; kolom < dimensiKolom; kolom++){
					System.out.print(data[kolom] + "\t");
				}
				System.out.println("");
			}
		
		public static void main(String[] args) {
			Soal1 jawab = new Soal1();
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try{
				System.out.print("Input number : ");
				int angka = Integer.parseInt(br.readLine());
				jawab.show(angka); 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}