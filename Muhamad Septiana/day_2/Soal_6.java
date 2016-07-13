package day_2;

import java.util.Scanner;

public class Soal_6 {
	public void show(int n)
		{
		
			System.out.println("Soal 6");
			int dimensi_Baris = n;
			int dimensi_Kolom = n;
		//	int  nilaiTengah = n /2;
			for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				for(int kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					if(n-baris-1 <= kolom)
					{
						System.out.print((((n-baris-1)+1)*2)-2+"\t");
					}
					
					else // menampilkan spasi pada baris dan kolom yang tidak dipilih
					{
						System.out.print("\t");
					}
				}
					System.out.println("");// menentukan batas akhir baris dengan enter
			}
			
			
			
		}
	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal_6 jawab = new Soal_6();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

