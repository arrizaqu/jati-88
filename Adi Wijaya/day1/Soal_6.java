package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_6 {

	int n=10;
	
	public void proses(){
		System.out.println("Soal_6");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i+j<=n-1){
					System.out.print(" \t");
				}else{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_6 der = new Soal_6();
		der.proses();
	}
}
