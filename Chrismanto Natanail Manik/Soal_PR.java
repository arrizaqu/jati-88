package com.exis.logic.hari1;
	
public class Soal_PR {

public void show(int n){
	int k = (n+1)/2;
	for (int t = 1; t <= n; t++) {
        if (t % 2 == 0) {
            continue;
        }
        for(int i=1;i <= n ; i++){
        	
    		for (int j=1 ; j <= n ;j++){
    			
    			if(i==j)
    				System.out.print(t+"\t");
    			else if(i == n - j+1)
    				System.out.print(t+"\t");
    			else if(i == k)
    				System.out.print(t+"\t");
    			else if(j == k)
    				System.out.print(t+"\t");
    			else
    				System.out.print(" ");
    		}
    		}
			System.out.println();
		}
	
}
public static void main(String[] args) {
Soal_PR jawab = new Soal_PR();
jawab.show(17);
}
}
