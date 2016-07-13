package com.xsis.bt88.day2;

	public class PostTest {

		public void proses(int n){
			int a = 0;
			int b = 1;
	
			for(int i=0; i<n; i++){
				for(int j=1; j<n; j++){
					if(i>0){
						if(i==j && i>5){ 
							System.out.print(a + "\t");
						}else if(i + j == n && i > 5){
							System.out.print(a + "\t");
						}else if(j == n/2){
							System.out.print(a + "\t");
						}else{
							System.out.print(" \t");
						}
						}else{
							System.out.print(" \t");
					}
				}
				a = a + b ;
				b = a - b;
				System.out.println();
			}
			
		}
		
		public static void main(String[] args) {
			PostTest soal = new PostTest();
			soal.proses(10);
		}

}
