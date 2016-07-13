package day_2;

public class SoalPreTest {

	public void proses(int n)
	{
		System.out.println("Soal Pre Test");
		int dimensi_Baris = n;
		int dimensi_Kolom = n;
		//int nilaiTengah = n / 2;
		//int maxGanjil =  n *2;
		//int angkaGanjil =0;
		
		for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
		{
			
			
			for(int kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
			{
				
				if(n- baris - 1 == kolom)// setiap * memenuhi baris dan kolom yang sama
				{
					
										
				System.out.print("["+((((n-baris-1)+1)*2)-1)+"]\t");
						
						
					
					
				}
				/*else if(baris == nilaiTengah)
				{
					System.out.print("["+((((kolom+1)*2)-1))+"]\t");
				}
				else if(kolom == nilaiTengah)
				{
					
					System.out.print("["+((((baris)+1)*2)-1)+"]\t");
				}
				*/
				else if(baris == kolom)
				{
					System.out.print("["+(((baris+1)*2)-1)+"]\t");
				}
				else // menampilkan spasi pada baris dan kolom yang tidak dipilih
				{
					System.out.print("\t ");
				}
			}
				System.out.println("");// menentukan batas akhir baris dengan enter
		}
	}
	
	public static void main(String[] args)
	{
		SoalPreTest jawab = new SoalPreTest ();
		jawab.proses(9);
	}
}
