package java88logic.xsis.bootcamp88.logic.day2;

public class PreTest {

	int n = 10;
	int m;
	public void proses(){
		System.out.println("PreTest");
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				if(i==j || i + j == n){
					m = j * 2 - 1;
					System.out.print(j + "\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PreTest der = new PreTest();
		der.proses();
	}
}
