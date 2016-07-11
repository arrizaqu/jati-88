package bootcamp.day1;

public class PostTest {
	public void show(int n){
		int dimensi_baris = n;
		int dimensi_kolom = n;
		int nilai_tengah = n / 2;
		
		for(int baris=0;baris<dimensi_baris;baris++){
			for(int kolom=0;kolom<dimensi_kolom;kolom++){
				if (n - baris - kolom == 1 && kolom < 5){
					System.out.print("*\t");
				}
				else if (kolom >=5 && baris == kolom){
					System.out.print("*\t");
				}
				else if (kolom == nilai_tengah){
					System.out.print("*\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println("\t");
		}
	}
	
	public static void main(String args []){
		Soal5 jawab = new Soal5();
		jawab.show(9);
	}
}
