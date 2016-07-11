package com.xsis.bc88.logic.day1;

public class Soal_1 {

	public void show_1(int n){
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (baris==kolom){
					System.out.print("*\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				
			}
			System.out.println("\t");
		}
	
	}
		
	public void show_2(int n){
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (n - baris - kolom == 1){
					System.out.print("*\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				
			}
			System.out.println("\t");
		}
	
	}
	
	public void show_3(int n){
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (n - baris - kolom == 1){
					System.out.print("*\t");
				}
				else if(baris==kolom){
					System.out.print("*\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				
			}
			System.out.println("\t");
		}
	
	}
	
	public void show_4(int n){
		int nilai_tengah_horizontal = n/2;
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (n - baris - kolom == 1){
					System.out.print("*\t");
				}
				else if(baris==kolom){
					System.out.print("*\t");
				}
				else if(baris==nilai_tengah_horizontal){
					System.out.print("*\t");
				}
				else if(kolom==nilai_tengah_horizontal){
					System.out.print("*\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				
			}
			System.out.println("\t");
		}
	
	}
	
	public void show_5(int n){
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (baris==kolom){
					System.out.print("*\t");
				}
				else if(baris<kolom){
					System.out.print("\t");
				}
				else
				{ 
				System.out.print("*\t");
				}
				
			}
			System.out.println("\t");
		}
	
	}
	
	public void show_6(int n){
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (n - baris - kolom ==1){
					System.out.print("*\t");
				}
				else if(n - baris <= kolom){
					System.out.print("*\t");
				}
				else
				{ 
				System.out.print("\t");
				}
				
			}
			System.out.println("\t");
		}
	
	}
	
	public void show_7(int n){
		for(int baris=0; baris < n; baris++){
			for(int kolom=0; kolom < n; kolom++){
				if (baris <= kolom && baris + kolom <= n - 1){
					System.out.print("*\t");
				}
				else
				{ 
				System.out.print("\t");
				}
			}
			System.out.println("\t");
		}
	
	}
	
	public static void main(String[] args) {
		Soal_1 jawab = new Soal_1();
		jawab.show_1(9);
		jawab.show_2(9);
		jawab.show_3(9);
		jawab.show_4(9);
		jawab.show_5(9);
		jawab.show_6(9);
		jawab.show_7(9);
	}
}
