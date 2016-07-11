package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_5 {

	int n=10;

	public void proses(){
		System.out.println("Soal_5");
		for(int i=1; i<n; i++){
			for(int j=1; j<=n; j++){
				if(i> j-1){
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_5 der = new Soal_5();
		der.proses();
	}
}
