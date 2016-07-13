package com.xsis.bt88.day2;

	public class Soal1 {
		
		int b = -1;
		public void proses(int n){
			
			
			for(int i=1; i<n; i++){
				
				b = b + 2;
				for(int j=1; j<n; j++){
				
					if(i==j){ 
						System.out.print(b + "\t"); 
					}else{
						System.out.print(" \t");
					}
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			Soal1 soal = new Soal1();
			soal.proses(10);
		}
}

