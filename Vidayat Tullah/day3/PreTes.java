package com.xsis.bt88.logic.day3;
import javax.swing.JOptionPane;
public class PreTes {
	
static void getData (int x){
		
		for (int baris = 1; baris <= 1; baris++){
			int a = 1;
			int b = 1;
			for (int kolom = 1; kolom < x; kolom++){
				if(baris == kolom){
					System.out.print( "1 \t");
				}else{
						System.out.print(a + " \t");
						a = a +b;
						b = a - b;
				}
				}
			System.out.println("");
			}
			
		
	}
	
	public static void main(String args[]){
		PreTes soal = new PreTes();
		soal.getData(Integer.valueOf(JOptionPane.showInputDialog("Masukkan angka :")));
	}

}
