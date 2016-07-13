package day_2_B.copy;
import java.util.Scanner;
public class Post_Test {
	public String[][] setDataArray2(int n)
	{
		//code
		int dimensiBaris = n;
		int dimensiKolom =n;
		String[][] data = new String[dimensiBaris][dimensiKolom];
		
		return data;
	}
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
		
		
		
				
			System.out.println("Post Test");
			int dimensi_Baris = n;
			int dimensi_Kolom = n;
		int  nilaiTengah = n /2;
		int nilaiAkhir =0;
		
		
		int nilaiSimpan =0;
		int nilaiPertama =1;
		int nilaiKedua =0;
		String [][] data = setDataArray(n);
		String [][] dataTranspos = setDataArray2(n);
			for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				
				nilaiPertama=1;
				nilaiKedua=0;
				for(int kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					nilaiSimpan = nilaiPertama +nilaiKedua;
					nilaiPertama = nilaiKedua;
					nilaiKedua = nilaiSimpan;
					
					//System.out.print(incrementKolom+"\t");
					
					data[baris][kolom]= Integer.toString(nilaiSimpan);
					
				}
					//System.out.println("");// menentukan batas akhir baris dengan enter
			}
			for(int kolom2=0;kolom2 < dimensi_Baris;kolom2++)
			{
				for(int baris2=0;baris2<dimensi_Kolom;baris2++)
				{
					
					dataTranspos[kolom2][baris2] = data[baris2][kolom2]; 
					
					
					
				}
				//System.out.println("");// menentukan batas akhir baris dengan enter
			}
			
			
			for(int baris =0; baris < dimensi_Baris;baris++)// menentukan panjang baris
			{
				
				
				for(int kolom = 0; kolom < dimensi_Kolom;kolom++) // menentukan panjang kolom
				{
					if(kolom == nilaiTengah)
					{
						System.out.print(dataTranspos[baris][kolom]+"\t");
					}
					else if((n-baris-1 == kolom)&&(baris >= kolom))
					{
						System.out.print(dataTranspos[baris][kolom]+"\t");
					}
					else if((baris == kolom)&&(baris >= nilaiTengah))
					{
						System.out.print(dataTranspos[baris][kolom]+"\t");
					}
					else // menampilkan spasi pada baris dan kolom yang tidak dipilih
					{
						System.out.print("\t");
					}
					
				}
					System.out.println("\t");// menentukan batas akhir baris dengan enter
			}
		}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("masukan Angka :");
		int n =s.nextInt();
		Post_Test jawab = new Post_Test();// membuat method untuk dipanggil
		jawab.show(n);// method yang dipanggil
	}
}

