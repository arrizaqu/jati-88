package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_3 {

	int n=10;
	public void proses(){
		System.out.println("Soal_3");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i == j || i + j == n){
					System.out.print("*" + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_3 der = new Soal_3();
		der.proses();
	}
}
