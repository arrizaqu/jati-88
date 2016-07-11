package java88logic.Xsisbootcamp88.logic;

public class Soal_1 {

	public void show(int n)
	{
		System.out.println("Soal 1");
		int i= 0,j = 0;
		for(i=0;i<n;i++)
		{
			
			
			for(j=0;j<n;j++ )
			{
				if(i== j){
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println("\t");
		}
	}
	public static void main(String[] args) {
		
		Soal_1 jawab = new Soal_1();
		jawab.show(9);
	}
}
