package day_2_B.copy;
import java.util.Scanner;
public class Soal_1 {
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
			int incrementNumber =1;
			int decreaseNumber = n* 2 -1;
			String [][] data = setDataArray(n);
			for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				for(int kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					if(baris == kolom)// setiap * memenuhi baris dan kolom yang sama
					{
						//System.out.print(incrementNumber);
						data[baris][kolom]= Integer.toString(incrementNumber);
						System.out.print(data[baris][kolom]+"\t");
					}
					else // menampilkan spasi pada baris dan kolom yang tidak dipilih
					{
						data[baris][kolom]= " ";
						System.out.print(data[baris][kolom]+"\t");
					}
				}
					System.out.println("");// menentukan batas akhir baris dengan enter
					incrementNumber = incrementNumber +2;
			}
			
			
			
		}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("masukan Angka :");
		int n =s.nextInt();
		Soal_1 jawab = new Soal_1();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

