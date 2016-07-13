package com.xsis.bt88.day2;

public class PreTest {



	public void proses(int n){
		int x;
		
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i==j || i + j == n){
					x = j * 2 - 1;
					System.out.print(x + "\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PreTest soal = new PreTest();
		soal.proses(10);
	}

}
