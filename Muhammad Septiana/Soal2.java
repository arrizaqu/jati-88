package day3;

import java.util.Scanner;



public class Soal2 {

	public String[][]setDataArray(int n)
	{
		int dimensiBaris = 1;
		int dimensiKolom = n;
		String[][] data = new String[dimensiBaris][dimensiKolom];
		
		return data;
	}
	public long[] getFib(int n)
	{
		int inputan = n;
		
		long[] vibo = new long[inputan];
		vibo[0]= 1;
		vibo[1]= 1;
		vibo[2]= 3;
		
		//mencari nilai vibonachi
		
				for(int baris=3;baris < inputan;baris++)
				{
					
							
						//logic mencari nilai vibonachi
						
						vibo[baris]=vibo[baris-1] +vibo[baris-2]+vibo[baris-3];
						//data[baris][kolom] = Integer.toString(vibo[kolom]);	
					
				}
		
		return vibo;
	}
	public void proses(int n)
	{
		String [][] data = setDataArray(n);
		long[] vibo =  getFib(n);
		int dimensiBaris = 1;
		int dimensiKolom =n;
		int inputan = n;
		Integer minData;
		minData = new Integer(3);
	
	
		
		
		
		//menampilkan data hasil dari nilai vibonachi
		for(int baris=0;baris<dimensiBaris;baris++)
		{
			for(int kolom=0;kolom < inputan;kolom++)
			{
				System.out.print(vibo[kolom]+"\t");
			}
			
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal2 jawab = new Soal2();// membuat method untuk dipanggil
		jawab.proses(n);// method yang dipanggil
	}
}
