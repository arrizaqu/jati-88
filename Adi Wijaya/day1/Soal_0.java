package java88logic.xsis.bootcamp88.logic.day1;

public class Soal_0 {

	public void show(){
		for(int k=1; k<=2;k++){
			for(int j=1; j<=2; j++){
				for(int i=1; i<=2; i++){	
					System.out.println("Hello " + i);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_0 javab = new Soal_0();
		javab.show();
	}
}
