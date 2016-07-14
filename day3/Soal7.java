package com.xsis.bt88.logic.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal7 {
	
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
		int nilaiTengah = n/2;
		long[] dataFib = getFib(n);
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				if (baris == kolom && kolom<=nilaiTengah){ //diagonal atas kiri
					data[baris][kolom] = String.valueOf(dataFib[kolom]);
				}
				else if (baris == kolom && kolom>=nilaiTengah){ //diagonal bawah kiri
					data[baris][kolom] = String.valueOf(dataFib[n-kolom-1]);
				}
				else if (baris + kolom == n - 1 && kolom>=nilaiTengah){ //diagonal atas kanan
					data[baris][kolom] = String.valueOf(dataFib[n-kolom-1]);
				}
				else if (baris + kolom == n - 1 && kolom<=nilaiTengah){ //diagonal bawah kanan
					data[baris][kolom] = String.valueOf(dataFib[kolom]);
				}
				else if(baris<kolom && baris+kolom < n-1){//atas
					data[baris][kolom] = String.valueOf(dataFib[baris]);
				}
				else if(baris>kolom && baris+kolom > n-1){//bawah
					data[baris][kolom] = String.valueOf(dataFib[n-baris-1]);
				}
				else if(baris<kolom && baris+kolom > n-1){//kanan
					data[baris][kolom] = String.valueOf(dataFib[n-kolom-1]);
				}
				else if(baris>kolom && baris+kolom < n-1){//kiri
					data[baris][kolom] = String.valueOf(dataFib[kolom]);
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
		Soal7 jawab = new Soal7();
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
