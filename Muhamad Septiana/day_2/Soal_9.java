package day_2;

import java.util.Scanner;

public class Soal_9 {
	public void show(int n)
		{
		
			System.out.println("Soal 1");
			int dimensi_Baris = n;
			int dimensi_Kolom = n;
			int incrementNumber =1;
			int decreaseNumber = n* 2 -1;
			int nilaiSebelum = 0;
			
			int nilaiAkhir =0;
			int kolom =0;
			
			int nilaiSimpan =0;
			int nilaiPertama =1;
			int nilaiKedua =0;
			for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				int incrementKolom =1;
				nilaiPertama=1;
				nilaiKedua=0;
				for(kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					
					nilaiSimpan = nilaiPertama +nilaiKedua;
					nilaiPertama = nilaiKedua;
					nilaiKedua = nilaiSimpan;
					
					System.out.print(nilaiSimpan+"\t");
				
incrementKolom = incrementKolom +1;				}
					System.out.println("");// menentukan batas akhir baris dengan enter
					
			incrementNumber = incrementNumber +1;
			decreaseNumber = decreaseNumber +1;
			}
			
			
			
		}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal_9 jawab = new Soal_9();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

