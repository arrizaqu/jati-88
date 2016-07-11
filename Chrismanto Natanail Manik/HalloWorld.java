package com.exis.logic.hari1;


public class HalloWorld {

	int a = 5;
	int b = 6;
	int c = a+b;
	
	public static void main(String args[]){
		HalloWorld hallo = new HalloWorld();
		hallo.proses();
	}
	public void proses (){
		System.out.println("Hallo Java programming:" +c);
	}
}
