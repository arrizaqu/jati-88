package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_1 {
	
	int n = 10;
	public void proses(){
		System.out.println("Soal_1");
		for(int i=1; i<n;i++){
			for(int j=1; j<n;j++){
				if(i==j){
					System.out.print("*");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_1 der = new Soal_1();
		der.proses();
	}
}
