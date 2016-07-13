package com.xsis.bt88.day2;

public class Soal9 {
//BELOM
	public void proses(int n){
		
		
		for(int i=1; i<n; i++){
			int a = 1;
			int b = 1;
			for(int j=1; j<n; j++){
				if(j == 1){
					System.out.print("1\t");
				}else{
					System.out.print(a + "\t");
					a = a+b;
					b = a-b;
				}		
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal9 soal = new Soal9();
		soal.proses(10);
	}

}
