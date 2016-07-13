package com.xsis.bc88.logic.day2;

import java.util.Scanner;

public class Soal8B {

	private static Scanner s;


		//set data => return array
		public String[][] getDataArray(int n){
			
			//code
			int dimensiBaris = n;
			int dimensiKolom = n;
			
			String[][] data = new String[dimensiBaris][dimensiKolom];
			for(int baris = 0; baris < dimensiBaris; baris++){
				int incrementNumberKolom = 1;
				int decreaseNumberKolom = 0;
				for(int kolom = 0; kolom < dimensiKolom; kolom++){
					if(baris == kolom){
					data[baris][kolom] = incrementNumberKolom + "";
					}
					else if(n - baris - kolom ==1){
					data[baris][kolom] = decreaseNumberKolom + "";
					}
					else if(baris >= kolom && baris + kolom <= n - 2){
					data[baris][kolom] = "A";
					}
					else if(baris <= kolom && baris  + kolom > n - 2){
					data[baris][kolom] = "B";
					}
					else{
					data[baris][kolom] = "";	
					}
					incrementNumberKolom = incrementNumberKolom +2;
					decreaseNumberKolom = decreaseNumberKolom +2;
				}
			}
			return data;
		}
		
		//menampilkan data array
		public void showing(int n){
			int dimensiBaris = n;
			int dimensiKolom = n;
			String[][] data = getDataArray(n);
			
			for(int baris = 0; baris < dimensiBaris; baris++){
				for(int kolom = 0; kolom < dimensiKolom; kolom++){
						System.out.print(data[baris][kolom]+"\t");}
				System.out.println("");
			}
			
		}

		
		public static void main(String[] args) {
			s = new Scanner(System.in);
			System.out.println("masukan angka :");
			int n = s.nextInt();
			Soal8B jawab = new Soal8B();
			jawab.showing(n);
		}
	}
