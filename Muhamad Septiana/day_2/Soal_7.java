package day_2;

import java.util.Scanner;

public class Soal_7 {
	public void show(int n)
		{
		
			System.out.println("Soal 1");
			int dimensi_Baris = n;
			int dimensi_Kolom = n;
			int incrementNumber =1;
			int decreaseNumber = n* 2 -2 ;
			
			for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				 
				for(int kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					
					if(baris == kolom)
					{
						System.out.print(incrementNumber);
					}
					else if(n- baris - 1 == kolom)// setiap * memenuhi baris dan kolom yang sama
					{
						System.out.print(decreaseNumber);
					}
					else if((n-baris-1 >= kolom)&& (baris <= kolom))
					{
						System.out.print("A");
					}
					else if((n-baris-1 <= kolom)&& (baris >= kolom))
					{
						System.out.print("B");
					}
					else // menampilkan spasi pada baris dan kolom yang tidak dipilih
					{
						System.out.print(" ");
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
		Soal_7 jawab = new Soal_7();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

