package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_7 {

	int n=10;
	public void proses(){
		System.out.println("Soal_7");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i+j>n-1 || i<j+1){ //kosong kiri
					if(i+j<n+1 || i>j-1){ //kosong kanan
						System.out.print("*\t"); 
					}else{
						System.out.print(" \t");//cetakan untuk kanan
					}
				}else{
					System.out.print(" \t");//cetakan untuk kiri
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_7 der = new Soal_7();
		der.proses();
	}
}
