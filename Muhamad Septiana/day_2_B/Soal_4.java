package day_2_B.copy;
import java.util.Scanner;
public class Soal_4 {
	public String[][] setDataArray(int n)
	{
		//code
		int dimensiBaris = n;
		int dimensiKolom =n;
		String[][] data = new String[dimensiBaris][dimensiKolom];
		
		return data;
	}
	public void show(int n)
		{
		
			System.out.println("Soal 1");
			int dimensi_Baris = n;
			int dimensi_Kolom = n;
			int nilaiTengah = n /2;
			int incrementNumber =1;
		
			int decreaseNumber = n* 2 -2 ;
			int baris =0;
			int kolom =0;
			int maxNilai = n*2;
			String [][] data = setDataArray(n);
			for(baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				int incrementKolom =0;	
				for(kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					
					if(baris == nilaiTengah)
					{
						
						//System.out.print(incrementKolom+"\t");
						data[baris][kolom]= Integer.toString(incrementKolom);
						System.out.print(data[baris][kolom]+"\t");
					}
					else if(baris == kolom)// setiap * memenuhi baris dan kolom yang sama
					{
						//System.out.print(incrementNumber+"\t");
						data[baris][kolom]= Integer.toString(incrementNumber);
						System.out.print(data[baris][kolom]+"\t");
					}
					else if(n - baris - 1 == kolom)// setiap * memenuhi baris dan kolom yang sama
					{
						//System.out.print(decreaseNumber+"\t");
						data[baris][kolom]= Integer.toString(decreaseNumber);
						System.out.print(data[baris][kolom]+"\t");
					}
					else if(kolom == nilaiTengah)
					{
						
						//System.out.print(incrementNumber+"\t");
						data[baris][kolom]= Integer.toString(incrementNumber);
						System.out.print(data[baris][kolom]+"\t");
					}
					else // menampilkan spasi pada baris dan kolom yang tidak dipilih
					{
						//System.out.print("\t");
						data[baris][kolom]= " ";
						System.out.print(data[baris][kolom]+"\t");
					}
					
					incrementKolom =incrementKolom +2;
				}
				
					System.out.println("");// menentukan batas akhir baris dengan enter
					
					
					
					incrementNumber =incrementNumber +2;
					decreaseNumber = decreaseNumber -2;
			}
			
			
			
		}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("masukan Angka :");
		int n =s.nextInt();
		Soal_4 jawab = new Soal_4();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

