package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_4 {

	int n= 10;
	public void proses(){
		System.out.println("Soal_4");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i == j || i + j == n || i == n/2 || j == n/2){
					System.out.print("*" + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_4 der = new Soal_4();
		der.proses();
	}
}
