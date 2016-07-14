package com.xsis.bt88.logic.day2;

public class SoalEmpat {



	
	public void proses(int n){
		
				//loop2
				int nilaiTengah = n /2;
				for (int baris=1;baris <n; baris ++){
					
							//loop1
							for (int kolom=1;kolom < n; kolom++){
								if(baris == kolom){
									System.out.print(baris + "." + kolom + " \t");
								}else if (baris ==  nilaiTengah){
									System.out.print(baris + "." + kolom + " \t");}
										else if (kolom == nilaiTengah){
											System.out.print(baris + "." + kolom + " \t");}
										else if (kolom + baris == n){
											System.out.print(baris + "." + kolom + " \t");}
												else{
												System.out.print(" \t");
											}
								
								
								
							}
							System.out.println("");
				}
	}
	
	public static void main(String args[]){
		
		SoalEmpat empat = new SoalEmpat();
		empat.proses(10);
		
		
		
	}
	
}
