package com.xsis.bt88.day2;

public class Soal5 {

	public void proses(int n){

		int x = -1;
		
		for(int i=1; i<n; i++){
			x = x + 2;
			for(int j=1; j<n; j++){
				if(i>=j){
					System.out.print(x + "\t");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Soal5 soal = new Soal5();
		soal.proses(10);
	}

}
