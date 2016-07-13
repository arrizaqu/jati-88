package day_2_B.copy;
import java.util.Scanner;
public class Soal_9 {
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
			int nilaiSebelum = 0;
			
			int nilaiAkhir =0;
			int kolom =0;
			
			int nilaiSimpan =0;
			int nilaiPertama =1;
			int nilaiKedua =0;
			String [][] data = setDataArray(n);
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
					
					data[baris][kolom]= Integer.toString(nilaiSimpan);
					System.out.print(data[baris][kolom]+"\t");
				
incrementKolom = incrementKolom +1;				}
					System.out.println("");// menentukan batas akhir baris dengan enter
					
			incrementNumber = incrementNumber +1;
			decreaseNumber = decreaseNumber +1;
			}
			
			
			
		}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("masukan Angka :");
		int n =s.nextInt();
		Soal_9 jawab = new Soal_9();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

