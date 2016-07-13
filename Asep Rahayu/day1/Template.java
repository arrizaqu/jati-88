package com.xsis.bt88.logic.day1;

public class Template {

	public void proses(int n) {
		for(int baris=0; baris<n; baris++){
		for(int kolom=0; kolom<n; kolom++){
			if(baris==kolom){
			System.out.print(baris+"."+kolom+" \t");}
			else {
				System.out.print("\t");
		}}System.out.println("");
		 }
	}
	
	public static void main(String[] args){
		Template temp = new Template();
		temp.proses(9);
	}
	
}
