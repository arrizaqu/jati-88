package com.xsis.bt88.logic.day2a;

	public class PostTest {

		public void proses(int n){
			int a = 0;
			int b = 1;
	
			for(int baris=0; baris<n; baris++){
				for(int kolom=1; kolom<n; kolom++){
					if(baris>0){
						if(baris==kolom && baris>5){ 
							System.out.print(a + "\t");
						}else if(baris + kolom == n && baris > 5){
							System.out.print(a + "\t");
						}else if(kolom == n/2){
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
