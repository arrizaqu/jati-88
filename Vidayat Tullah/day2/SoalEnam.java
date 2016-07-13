package com.xsis.bt88.logic.day2;

public class SoalEnam {
	
public void proses(int n){
		
		//loop2
		for (int baris=1;baris <n; baris ++){
			
					//loop1
					for (int kolom=1;kolom < n; kolom++){
						if(baris + kolom == n){
							System.out.print(baris + "." + kolom + " \t");}
						else if (n - baris - kolom <0){
							System.out.print(baris + "." + kolom + " \t");
						}
										else{
										System.out.print(" \t");}
						
					}
					System.out.println("");
		}
}

public static void main(String args[]){

SoalEnam enam = new SoalEnam();
enam.proses(10);



}

}
