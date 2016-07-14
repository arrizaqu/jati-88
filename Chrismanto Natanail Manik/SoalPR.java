package com.exis.logic.hari3;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class SoalPR {
	public static void main(String args[]) {
		int n = 9;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			n = Integer.parseInt(br.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
		(new SoalPR()).showing(n);
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
		int aJ = (n*2)-1;
		int[] f=fibo(n);
		String[] aH = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int k=n/2;
		
	
	
		String[][] array = new String[aI][aJ];
		
		for(int i = 0; i < aI; i++){
			int i1=0; int i2=0;
			for(int j =0; j < aJ; j++){
				if(i == j ||i==n -j-1 ||j==i+n-1||i==(2*n)-j-2)
						array[i][j] = String.valueOf(f[i1]);
				else if (i==k && j != k && j!= k+n-1)
					array[i][j] =aH[i2%26];
				else 
					array[i][j]="";
				if(j<n-1){
					i1++; if(j!= k)i2++;
					
				}
				else{
					i1--;if(j!=k +n-1)i2--;
				}
			}
			
		
		}		
		return array;
	}
	
	public void showing(int n){
		{
			// code
			int aI = n;
			int aJ = (2*n)-1;
		
			
			String[][] array = getDataArray(n);
			for(int i = 0; i < aI; i++){
				for(int j =0; j < aJ; j++){
					System.out.print(array[i][j] + "\t");
				}
				System.out.println("\t");
			}}
		}
}
