package java88logic.Xsisbootcamp88.logic;

public class Soal_2 {
	public void show(int n)
	{
		System.out.println("Soal 2");
		int i= 0,j = 0,k = 0;
		for(i=0;i<n;i++)
		{
			
			
			for(j=0;j<n;j++ )
			{
				k = j - n +1 ;
				if (k <=0)
				{
					k= k *-1;
				}
				if(i==k){
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
		
		Soal_2 jawab = new Soal_2();
		jawab.show(9);
	}
}
