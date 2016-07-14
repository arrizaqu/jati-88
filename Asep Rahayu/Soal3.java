package com.xsis.bt88.day3;
//BELOM
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal3 {
	
	public static void  main(String ars[])throws Exception
	{ 
		Soal3 logic = new Soal3();
            
            int a;// Variabel pembagi
            int b;//menyimpan hasil mod
            int c;//menyimpan hasil mod
            int FPB=0; 
            int KPK;
            int num1=3;
            int num2=7;
            for(a=1;a<=num1;a++){
                b= num1 % a;
                c= num2 % a;
                if(b==c && b==0 && c==0){
                    FPB=a;
                }
            }
            KPK = (num1* num2)/FPB;
            System.out.println("FPB dari ("+num1+", "+num2+")"
                   + " adalah "+ FPB +"\nKPK dari ("+num1+", "+num2+") adalah "+KPK);
	}
	
//	public void KPK

	
}
