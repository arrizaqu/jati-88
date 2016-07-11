package java88logic.Xsisbootcamp88.logic;

public class Soal_3 {
	public void show(int n)
	{
		System.out.println("Soal 3");
		
		int dimensi_baris = n;
		int dimensi_kolom = n;
		
		for(int baris = 0 ; baris < dimensi_kolom; baris++)
		{
			
			
			for(int kolom = 0; kolom < dimensi_baris;kolom++ )
			{
				if(n - baris - kolom ==1)
				{
					System.out.print("*\t");
				}
				else if (baris == kolom)
				{
					System.out.print("&\t");
				}
			
				
				else {
					System.out.print("\t");
				}
				
				
			}
			System.out.println("\t");
		}
	}
	public static void main(String[] args) {
		
		Soal_3 jawab = new Soal_3();
		jawab.show(9);
	}
}
