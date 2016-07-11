package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_2 {

	int n = 10;
	public void proses(){
		System.out.println("Soal_2");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if( i + j == n+1){
					System.out.print("*");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_2 der = new Soal_2();
		der.proses();
	}
}
