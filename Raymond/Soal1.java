package bootcamp.day1;

public class Soal1 {
	public void show(){
		System.out.println("Soal");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
			System.out.println("java" +i);
			}
		}
	}
}	
	
	public void nomor1(){
		int i; 
		int j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print(" ");
				}
					System.out.println("* ");
			}
	}
	
	public void nomor2(){
		int i; 
		int j;
		for(i=9;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print(" ");
				}
					System.out.println("* ");
			}
	}
	
	public void nomor3(){
		int i; 
		int j;
		int angka=9;
		for(i=1;i<=angka;i++){
			for(j=1;j<=angka;j++){
				if (i==j || j==angka-i+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
				System.out.println("");
		}
	}
	
	public void nomor4(){
		int i; 
		int j;
		int angka=9;
		for(i=1;i<=angka;i++){
			for(j=1;j<=angka;j++){
				if (i==j || j==angka-i+1){
					System.out.print("*");
				}
				else if( i==5 || j==5 ){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
				System.out.println("");
		}
	}
	
	public void nomor5(){
		int i; 
		int j;
		for(i=1;i<=10;i++){
			for(j=1;j<=i;j++){
				System.out.print("* ");
				}
					System.out.println("");
			}
	}
	
	public void nomor6(){
		int i; 
		int j;
		int angka = 9;
		int jumlah;
		for(i=1;i<=10;i++){
			for(jumlah=angka;jumlah>=1;jumlah--){
				System.out.print("  ");
		}
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println("");
		angka--;
		}
	}
	
	public void nomor8(){
		int i; 
		int j;
		int k;
		int angka = 5;
		for(i=1;i<=angka;i++){
			for(j=1;j<=i;j++)
				System.out.print("*");
			for(k=1;k<=(2*(angka-i));k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
				System.out.println(" ");
		}
		for(i=angka-1;i>=1;i--){
			for(j=1;j<=i;j++)
				System.out.print("*");
			for(k=1;k<=(2*(angka-i));k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
				System.out.println(" ");
		}
	}
	
	public static void main(String args []){
		Soal1 jawab = new Soal1();
		jawab.show();
		jawab.nomor1();
		System.out.println();
		jawab.nomor2();
		System.out.println();
		jawab.nomor3();
		System.out.println();
		jawab.nomor4();
		System.out.println();
		jawab.nomor5();
		System.out.println();
		jawab.nomor6();
		System.out.println();
		jawab.nomor8();
	}
}
