
package com.exis.logic.hari2;

public class ArraySoal2B {
	public String[][] getDataArray(int n){
		// code
		int dI = n;
		int dJ = n;
	
		String[][] data = new String[dJ][dI];
		for(int i = 0; i < dI; i++){
			int z=0;
			for(int j =0; j < dJ; j++){
				if(i == n-j-1){
					data[i][j] = z+" ";
				}	else{
						data[i][j]= " ";
				}
				z=z+2;
				
			}
		}
		
		return data;
	}
	
	//menampilkan data menapilkan array
	public void showing(int n){
		// code
		int dI = n;
		int dJ = n;
		
		String[][] data = getDataArray(n);
		for(int i = 0; i < dI; i++){
			for(int j =0; j < dJ; j++){
				if(data[i][j] != null){
				System.out.print(data[i][j] + "\t");
				}else
					System.out.print("\t");
				
				}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		ArraySoal2B jawab = new ArraySoal2B();
		jawab.showing(9);
	}

}
