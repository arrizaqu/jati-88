package com.xsis.bt88.logic.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal6 {
	
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
	public String[][] getDataArray(int n){
		//code
		int dimensiBaris = n;
		int dimensiKolom = n;
		long[] dataFib = getFib(n);
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				if(baris == kolom){
					data[baris][kolom] = String.valueOf(dataFib[baris]);
				}
				else if(baris + kolom == n - 1){
					data[baris][kolom] = String.valueOf(dataFib[n-baris-1]);
				}
				else if(baris<kolom && baris+kolom < n-1){
					data[baris][kolom] = "A";
				}
				else if(baris>kolom && baris+kolom > n-1){
					data[baris][kolom] = "C";
				}
				else if(baris<kolom && baris+kolom > n-1){
					data[baris][kolom] = "D";
				}
				else if(baris>kolom && baris+kolom < n-1){
					data[baris][kolom] = "B";
				}
				else{
					data[baris][kolom] = "";
				}
			}
		}
		return data;	
	}
			
	//menampilkan data => menampilkan array
	public void showing(int n){
		int dimensiBaris = n;
		int dimensiKolom = n;
		
		String[][] data = getDataArray(n);
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				System.out.print(data[baris][kolom] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Soal6 jawab = new Soal6();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.print("Input number : ");
			int angka = Integer.parseInt(br.readLine());
			jawab.showing(angka); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
