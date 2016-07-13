package com.xsis.bt88.day2;

//BELOM
	public class Soal7 {

		public void proses(int n){
			int z = -1;
			int x = 16;
			
			for(int i=1; i<n; i++){
				z = z + 2;
				for(int j=1; j<n; j++){
					if(i==j){
						System.out.print(z + "\t");
					}else if(i+j==n){
						System.out.print(x + "\t");
						x = x - 2;
					}else if(i <= j && i + j <= n - 1){
						System.out.print("A\t");
					}else if(i >= j && i + j >= n){
						System.out.print("B\t");
					}else{
						System.out.print("\t");
					}
					
					
				}
				System.out.println();
				
			}
			
		}
		
		public static void main(String[] args) {
			Soal7 soal = new Soal7();
			soal.proses(10);
		}

}
