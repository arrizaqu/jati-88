package day_2;

import java.util.Scanner;

public class Soal_5 {
	public void show(int n)
		{
		
			System.out.println("Soal 1");
			int dimensi_Baris = n;
			int dimensi_Kolom = n;
			int nilaiTengah = n /2;
			int incrementNumber =1;
			int incrementKolom= 1;
			int decreaseNumber = n* 2 -2 ;
			int baris =0;
			int kolom =0;
			int maxNilai = n*2;
			
			for(baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				
				for(kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					
					if(baris >= kolom)
					{
						System.out.print(((kolom+1)*2)-1+"\t");
					}
					else // menampilkan spasi pada baris dan kolom yang tidak dipilih
					{
						System.out.print("\t");
					}
					
					
				}
				
					System.out.println("");// menentukan batas akhir baris dengan enter
					
					
					
					incrementNumber =incrementNumber +2;
					decreaseNumber = decreaseNumber -2;
			}
			
			
			
		}
	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal_5 jawab = new Soal_5();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

