package com.test.logic.day_3;

import com.test.logic.common.Utility;

public class Soal_8 {
	
	public int n;
	public int nT;
	public int nLebar;
	public int nPanjang;
	public String[][] array2D;
	
	public Soal_8(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.nT = n / 2;
		this.nPanjang = (n * 2) - 1;
		this.nLebar = n;
		this.array2D = new String[nLebar][nPanjang];
	}
	
	public void setIsiArray(){
		for(int baris = 0; baris < this.nLebar ; baris++){
			int index = 0;
			for(int kolom = 0; kolom < this.nPanjang ; kolom++){
				this.array2D[baris][kolom] = "*";
			}
		}
		
	}
	
	public void showArray(){
		this.setIsiArray();
		Utility.printArray2D(this.nLebar, this.nPanjang, this.array2D);
	}

}
