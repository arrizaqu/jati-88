package day3;

import java.util.Scanner;



public class Soal6 {

	public String[][]setDataArray(int n)
	{
		int dimensiBaris = n;
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
		
		
		//mencari nilai vibonachi
		
				for(int baris=2;baris < inputan;baris++)
				{
					
							
						//logic mencari nilai vibonachi
						
						vibo[baris]=vibo[baris-2] +vibo[baris-1];
						//data[baris][kolom] = Integer.toString(vibo[kolom]);	
					
				}
		
		return vibo;
	}
	public void proses(int n)
	{
		String [][] data = setDataArray(n);
		long[] vibo =  getFib(n);
		int dimensiBaris = n;
		int dimensiKolom =n;
		int inputan = n;
		int incrementNumber = 1;
		int decreaseNumber = n *2 -1;
		Integer minData;
		minData = new Integer(3);
		
		//menampilkan data hasil dari nilai vibonachi
		for(int baris=0;baris<dimensiBaris;baris++)
		{
			int incrementKolom =1;
			vibo[0]=1;
			vibo[1]=1;
			for(int kolom=0;kolom < dimensiKolom;kolom++)
			{
				
				
				if(baris == kolom)
				{
					//System.out.print(incrementNumber);
					data[baris][kolom]= String.valueOf(vibo[kolom]);
					System.out.print(data[baris][kolom]+"\t");
				}
				else if(n- baris - 1 == kolom)// setiap * memenuhi baris dan kolom yang sama
				{
					//System.out.print(decreaseNumber);
					data[baris][kolom]= String.valueOf(vibo[kolom]);
					System.out.print(data[baris][kolom]+"\t");
				}
				else if((n-baris-1 >= kolom)&& (baris <= kolom))
				{
					//System.out.print("A");
					data[baris][kolom]= "A";
					System.out.print(data[baris][kolom]+"\t");
				}
				else if((n-baris-1 <= kolom)&& (baris >= kolom))
				{
					//System.out.print("B");
					data[baris][kolom]= "C";
					System.out.print(data[baris][kolom]+"\t");
				}
				else if((baris >= n-kolom-1)&& (baris <= kolom))
				{
					data[baris][kolom]= "B";
					System.out.print(data[baris][kolom]+"\t");
				}
				else if((baris <= n-kolom-1)&& (baris >= kolom))
				{
					data[baris][kolom]= "D";
					System.out.print(data[baris][kolom]+"\t");
				}
				else // menampilkan spasi pada baris dan kolom yang tidak dipilih
				{
					//System.out.print(" ");
					data[baris][kolom]= " ";
					System.out.print(data[baris][kolom]+"\t");
				}
				
				incrementKolom = incrementKolom+1;
			}
			
			incrementNumber = incrementNumber +1;
			decreaseNumber = decreaseNumber +1;
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("masukan Angka :");
		int n =s.nextInt();
		Soal6 jawab = new Soal6();// membuat method untuk dipanggil
		jawab.proses(n);// method yang dipanggil
	}
}
