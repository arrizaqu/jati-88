package com.xsis.bt88.day2;

public class Soal8 {
//BELOM
	public void proses(int n){

		int x = 16;
		int z = 1;
		
		for(int i=1; i<n; i++){
			
			for(int j=1; j<n; j++){
				if(i==j){
					System.out.print(z + "\t");
					z = z + 2;
				}else if(i+j==n){
					System.out.print(x + "\t"); 
					x = x - 2;
				}else if(i+j>n || i<j){
					if(i+j<n || i>j){
						System.out.print("\t");
					}else{
						System.out.print("B\t");
					}
				}else{
					System.out.print("A\t");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal8 soal = new Soal8();
		soal.proses(10);
	}

}
