package java88logic.xsis.bootcamp88.logic.day2;

public class Soal1 {

	int n = 10;
	int m = -1;
	public void proses(){
		
		
		System.out.println("Soal1");
		for(int i=1; i<n; i++){
			m = m + 2;
			for(int j=1; j<n; j++){
				if(i==j){ //kondisi untuk garis miring (jika nomor baris sama dengan nomor kolom)
					System.out.print(m + "\t"); 
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal1 der = new Soal1();
		der.proses();
	}
}
