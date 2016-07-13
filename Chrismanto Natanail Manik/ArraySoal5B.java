package com.exis.logic.hari2;

public class ArraySoal5B {
	public String[][] getDataArray(int n){
		// code
		int dI = n;
		int dJ = n;
		
		int z = 1;
		
		String[][] data = new String[dJ][dI];
		for(int i = 0; i < dI; i++){
			
			for(int j =0; j < dJ; j++){
				if(i >= j)
					data[i][j] = z+"";
				else
						data[i][j]= " ";
				
				
					}
			
			z=z+2;
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
		ArraySoal5B jawab = new ArraySoal5B();
		jawab.showing(9);
	}

}
