package com.xsis.bt88.logic.day1;

public class Soal7 {
	public void proses(int n) {
		
	/*	for(int i=1; i<=n-2; i++){
		for(int j=n-1; j>=i; j--){
			System.out.print("\t");}
		for(int k=1; k<=i; k++){	
			System.out.print("* \t");}
		for (int l=1; l<i; l++) {
				System.out.print("* \t");
		}System.out.println("");} 
		 } */
		/*
		for(int a=0; a<=n-1; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print(""); }
		for(int c=0; c>=(a-n+1); c--) {
			System.out.print("*"); }
		System.out.println(""); 
		}
	
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.println(""); 
			}
			for(int j=0; j<(i+1); j++){
				System.out.print("*");
			}
			System.out.println(""); 
		} */
		
		for(int i=1; i<=n-2; i++){
			for(int j=0; j<=i; j++){
				System.out.print("\t");}
			for(int k=i; k<=n-1; k++){	
				System.out.print("* \t");}
			for (int l=i; l<n-2; l++) {
					System.out.print("* \t");
			}System.out.println("");} 
			 
		for(int i=1; i<=n-2; i++){
			for(int j=n-1; j>=i; j--){
				System.out.print("\t");}
			for(int k=1; k<=i; k++){	
				System.out.print("* \t");}
			for (int l=1; l<i; l++) {
					System.out.print("* \t");
			}System.out.println("");} 
			 } 
	/*	for(int i=1; i<=n-2; i++){
			for(int j=n-1; j>=i; j--){
				System.out.print("\t");}
			for(int k=i; k<=i; k++){	
				System.out.print("* \t");}
			for (int l=1; l<i; l++) {
					System.out.print("* \t");
			}System.out.println("");} */
		
		
	//}

	
	public static void main(String[] args){
		Soal7 soal = new Soal7();
		soal.proses(9);
	}
}
