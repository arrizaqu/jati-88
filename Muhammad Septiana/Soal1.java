package day3;

import java.util.Scanner;



public class Soal1 {

	public String[][]setDataArray(int n)
	{
		int dimensiBaris = 1;
		int dimensiKolom = n;
		String[][] data = new String[dimensiBaris][dimensiKolom];
		
		return data;
	}
	public void proses(int n)
	{
		String [][] data = setDataArray(n);
		int dimensiBaris = 1;
		int dimensiKolom =n;
		int nilaiSimpan = 0;
		int nilaiPertama = 1;
		int nilaiKedua = 0;
		
		
		//mencari nilai vibonachi
		for(int baris=0;baris < dimensiBaris;baris++)
		{
			nilaiPertama = 1;
			nilaiKedua = 0;
			for(int kolom=0;kolom < dimensiKolom;kolom++)
			{
				//logic mencari nilai vibonachi
				nilaiSimpan = nilaiPertama +nilaiKedua;
				nilaiPertama = nilaiKedua;
				nilaiKedua = nilaiSimpan;
				//simpan hasil nilai vibonachi
				data[baris][kolom] = Integer.toString(nilaiSimpan);
			}	
			
		}
		
		//menampilkan data hasil dari nilai vibonachi
		for(int baris=0;baris<dimensiBaris;baris++)
		{
			for(int kolom=0;kolom < dimensiKolom;kolom++)
			{
				System.out.print(data[baris][kolom]+"\t");
			}
			
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal1 jawab = new Soal1();// membuat method untuk dipanggil
		jawab.proses(n);// method yang dipanggil
	}
}
