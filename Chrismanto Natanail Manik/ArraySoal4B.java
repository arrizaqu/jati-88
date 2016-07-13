package com.exis.logic.hari2;

public class ArraySoal4B {
	public String[][] getDataArray(int n){
		// code
		int dI = n;
		int dJ = n;
		int k=n/2;
		int z = 1;
		
		String[][] data = new String[dJ][dI];
		for(int i = 0; i < dI; i++){
			int z2 =0;
			for(int j =0; j < dJ; j++){
				if(i==j||j==k)
					data[i][j] = z+"";
				else if(i == n-j-1||i==k)
					data[i][j] = z2+" ";
					else
						data[i][j]= " ";
				
				
				z2=z2+2;	
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
		ArraySoal4B jawab = new ArraySoal4B();
		jawab.showing(9);
	}

}
