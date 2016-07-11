package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_8 {

	int n=10;
	public void proses(){
		System.out.println("Soal_8");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i+j>n || i<j){ //kondisi bintang kiri
					if(i+j<n || i>j){ //kondisi bintang kanan
						System.out.print(" \t");
					}else{
						System.out.print("*\t"); //cetakan untuk bintang kanan 
					}
				}else{
					System.out.print("*\t"); //cetakan untuk  bintang kiri
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_8 der = new Soal_8();
		der.proses();
	}
}
