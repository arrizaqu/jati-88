package com.xsis.bt88.day2;
	

	public class Soal2 {
		
		public void proses(int n){

			for(int i=1; i<n; i++){
				int x = 0;
				for(int j=1; j<n; j++){
					if(i+j==n){ 
						System.out.print(x + "\t"); 
					}else{
						System.out.print(" \t");
					}
					x = x + 2;
				}
				System.out.println();
			} 
			}
		
		
		public static void main(String[] args) {
			Soal2 soal = new Soal2();
			soal.proses(10);
		}
}
