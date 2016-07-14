package com.exis.logic.hari3;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Soal8 {
	public static void main(String args[]) {
		int n = 9;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			n = Integer.parseInt(br.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
		(new Soal8()).showing(n);
	}
	

	public String[][] getDataArray(int n){
		// code
		int aI = n;
		int aJ = (n*2)-1;
	
		int k=n/2;
		
	
	
		String[][] array = new String[aI][aJ];
		int i1=1;
		for(int i = 0; i < aI; i++){
			int i2=1;
			for(int j =0; j < aJ; j++){
				if((i <= j && i<=n -j-1 && i% 2 == 0)||(i>=j && i>=n -j -1 && i%2 ==0))
					array[i][j] = String.valueOf(i1);
				else if ((i<= j&& i>= n-j-1 && j%2 ==0)||(i>=j && i<=n-j-1 && j%2 == 0))
					array[i][j] = String.valueOf(i2);
				else 
					array[i][j] = "";
				if(j<k) i2++; else i2--;
			}
			if(i<k)i1++;else i1--;
					
				
			
				
			}
			
		
		
		return array;
	}
	
	public void showing(int n){
		{
			// code
			int aI = n;
			int aJ = n;
		
			
			String[][] array = getDataArray(n);
			for(int i = 0; i < aI; i++){
				for(int j =0; j < aJ; j++){
					System.out.print(array[i][j] + "\t");
				}
				System.out.println("\t");
			}}
		}
}
