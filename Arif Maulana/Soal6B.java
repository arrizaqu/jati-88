package com.xsis.bc88.logic.day2;

import java.util.Scanner;

public class Soal6B {

	private static Scanner s;


	//set data => return array
		public String[][] getDataArray(int n){
			
			//code
			int dimensiBaris = n;
			int dimensiKolom = n;
			
			String[][] data = new String[dimensiBaris][dimensiKolom];
			for(int baris = 0; baris < dimensiBaris; baris++){
				int decreaseNumberKolom = 0;
				for(int kolom = 0; kolom < dimensiKolom; kolom++){
					if(n - baris - kolom ==1){
					data[baris][kolom] = decreaseNumberKolom + "";
					}
					else if(n - baris <= kolom){
					data[baris][kolom] = decreaseNumberKolom + "";
					}
					else{
					data[baris][kolom] = "";	
					}
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
			Soal6B jawab = new Soal6B();
			jawab.showing(n);
		}
	}
