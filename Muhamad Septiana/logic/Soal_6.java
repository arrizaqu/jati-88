package java88logic.Xsisbootcamp88.logic;

public class Soal_6 {
	public void show(int n)
	{
		System.out.println("Soal 6");
	
		int dimensi_baris = n;
		int dimensi_kolom = n;
		//int nilaiTengahHorizontal = n /2;
		//int nilaiTengahVertikal = n /2;
		for(int baris = 0 ; baris < dimensi_kolom; baris++)
		{
			
			
			for(int kolom = 0; kolom < dimensi_baris;kolom++ )
			{
				
				 if(n - baris - kolom <= 1){
					 System.out.print("*\t");
				 }
				else {
					System.out.print("\t");
				}
				
				
			}
			System.out.println("\t");
		}
	}
	public static void main(String[] args) {
		
		Soal_6 jawab = new Soal_6();
		jawab.show(9);
	}
}
