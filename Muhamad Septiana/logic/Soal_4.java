package java88logic.Xsisbootcamp88.logic;

public class Soal_4 {
	public void show(int n)
	{
		System.out.println("Soal 4");
		
		int dimensi_baris = n;
		int dimensi_kolom = n;
		int nilaiTengahHorizontal = n /2;
		int nilaiTengahVertikal = n /2;
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
				else if (kolom == nilaiTengahHorizontal)
				{
					System.out.print("@\t");
				}
				else if ( baris == nilaiTengahVertikal)
				{
					System.out.print("@\t");
				}
				else {
					System.out.print("\t");
				}
				
				
			}
			System.out.println("\t");
		}
	}
	public static void main(String[] args) {
		
		Soal_4 jawab = new Soal_4();
		jawab.show(9);
	}
}
