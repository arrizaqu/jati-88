package bootcamp.day1;

public class HalloJava {
	
	//variable
	int a = 5;
	int b = 6;
	int c = a + b;
	HalloJava hallo = null;
	
	//function / method
	public void proses(){
		System.out.println("Hallo java programming : " + c);
	}
	
	//program main
	public static void main(String args []){
		HalloJava hallo = new HalloJava();
		hallo.proses();
		
	}
}
