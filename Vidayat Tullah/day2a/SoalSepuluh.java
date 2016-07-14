package com.xsis.bt88.logic.day2a;

	public class SoalSepuluh {

		public void proses(int n){
			int a = 0;
			int b = 1;

			for(int i=0; i<n; i++){

				for(int j=1; j<n; j++){
					if(i > 0){
						System.out.print(a + "\t");
					}else{
						System.out.print("\t");

					}		
				}
				a = a+b;
				b = a-b;
				System.out.println();

			}
		}
		
		public static void main(String[] args) {
			SoalSepuluh soal = new SoalSepuluh();
			soal.proses(10);
		}

}
