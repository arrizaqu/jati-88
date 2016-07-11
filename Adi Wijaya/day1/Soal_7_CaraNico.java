package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_7_CaraNico {


	int n=10;
	public void proses(){
		System.out.println("Soal_7");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if((i+j>n-1 || i<j+1)&&(i+j<n+1 || i>j-1)){
						System.out.print("*\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_7_CaraNico der = new Soal_7_CaraNico();
		der.proses();
	}
}
