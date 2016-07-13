package com.test.logic.day_3;

import java.io.IOException;

import com.test.logic.common.Utility;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int angka = Utility.getInputInteger("masukkan angka : ");
		Soal_8 jawab = new Soal_8(angka);
		jawab.showArray();
	}
}
