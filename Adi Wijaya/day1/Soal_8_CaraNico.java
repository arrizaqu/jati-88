package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_8_CaraNico {

	int n=10;
	public void proses(){
		System.out.println("Soal_8");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if((i+j>n || i<j)&&(i+j<n || i>j)){
						System.out.print(" \t");
				}else{
					System.out.print("*\t");
				}				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_8_CaraNico der = new Soal_8_CaraNico();
		der.proses();
	}
}
