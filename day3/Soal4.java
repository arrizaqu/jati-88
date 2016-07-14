package com.xsis.bt88.logic.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal4 {
		public void getPrime(int n){
			//loop number
			for (int i=2;i<n;i++){
				boolean isPrime = true;
				//check if number is prime
				for(int j=2;j<i;j++){
					if(i%j==0){
						isPrime = false;
						break;
					}
				}
				if(isPrime)
					System.out.print(i+" ");
				}
			}
		
	public static void main(String[] args) {
		Soal4 jawab = new Soal4();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);			
		try{
			System.out.print("Input number : ");
			int angka = Integer.parseInt(br.readLine());
			jawab.getPrime(angka); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}