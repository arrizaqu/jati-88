package com.xsis.bt88.logic.day2;

public class SoalLima {
	
	public void proses(int n){
		
		//loop2
		
		for (int baris=1;baris <n; baris ++){
			
					//loop1
					for (int kolom=1;kolom < n; kolom++){
						if(baris == kolom){
							System.out.print(baris + "." + kolom + " \t");}
						else if (baris > kolom){
							System.out.print(baris + "." + kolom + " \t");
						}
										else{
										System.out.print(" \t");}
						
					}
					System.out.println("");
		}
}

public static void main(String args[]){

SoalLima lima = new SoalLima();
lima.proses(10);



}

}
