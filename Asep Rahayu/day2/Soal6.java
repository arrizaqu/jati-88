package com.xsis.bt88.day2;

public class Soal6 {

		public void proses(int n){
			int x = (n*2)-2;
			
			for(int i=1; i<n; i++){
				x = x - 2;
				for(int j=1; j<n; j++){
					if(i+j<=n-1){
						System.out.print("\t");
						
					}else{
						System.out.print(x + "\t");
						
					}
					
					
				}
				System.out.println();
			}
		}

		
		public static void main(String[] args) {
			Soal6 soal = new Soal6();
			soal.proses(10);
		}

}
