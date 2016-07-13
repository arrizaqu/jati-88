package com.xsis.bt88.day2;

public class Soal4 {

	public void proses(int n){
		
		int x;
		
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i==j){ 
					x = j * 2 - 1;
					System.out.print(x + "\t");
				}else if(i + j == n){
					x = j * 2 - 2;
					System.out.print(x + "\t");
				}else if(j == n/2){
					x = i * 2 - 1;
					System.out.print(x + "\t");
				}else if(i == n/2){
					x = j * 2 - 2;
					System.out.print(x + "\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) {
		Soal4 soal = new Soal4();
		soal.proses(10);
	}

}
