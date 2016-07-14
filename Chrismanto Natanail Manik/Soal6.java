package com.exis.logic.hari3;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Soal6 {
	public static void main(String args[]) {
		int n = 9;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			n = Integer.parseInt(br.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
		(new Soal6()).showing(n);
	}
	

	private static int[] fibo(int n)
	{
		int[] f = new int[n];
		for (int i =0;i<n;i++){
			if(i<2)
				f[i]=1;
			else
				f[i]=f[i-1]+f[i-2];
		}
				return f;
	}
	public String[][] getDataArray(int n){
		// code
		int aI = n;
		int aJ = n;
		int[] f =fibo(n);
		
	
		
		
	
		String[][] array = new String[aI][aJ];
		for(int i = 0; i < aI; i++){
			for(int j =0; j < aJ; j++){
				if(i == j)
					array[i][j] = String.valueOf(f[i]);
				else if (i==n-j-1)
					array[i][j] = String.valueOf(f[n-i-1]);
				else if (i<j && i<n -j -1)
					array[i][j] = "A";
				else if(i<j && i>n -j-1)
					array[i][j] = "B";
				else if(i>j && i>n-j-1)
					array[i][j] = "C";
				else
					array[i][j] = "D";
				
			
				
			}
			
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
				System.out.println("");
			}}
		}
}
