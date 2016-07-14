package com.xsis.bt88.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal9 {
	
public String[] getFib(int n){
        
	String[] data = new String[n];
	    int angka1=1;
        int angka2=0;
        //char[] abjad = getAbjad();
    	//int i =0;
        for(int y = 0; y < n; y++){
           
            if(y % 2==1)
            { 
            		data[y] = ""; 
            } else {
                data[y] = angka1+"";
                angka1=angka1+angka2;
                angka2=angka1-angka2;
            }
        }
        return data;
    }
    
    public String[][] setData(int n){
        String[][] data = new String[n][n];
        String[] fib1 = getFib(n);
        
        
        int max = n - 1;
        for(int y = 0; y < n; y++)
        {
            for(int x= 0; x < n; x++)
            {
            	
                if(y+x<=max && x<=y) //Kiri
                {
                	data[x][y]= fib1[x]+"\t";                                  
                }
                else if(y+x<=max && x>=y) //Atas
                {
                     data[x][y]= fib1[y]+"\t";
                }
                else if( y + x >= max && x <= y)//Bawah 
                {
                    data[x][y]=  fib1[n-y-1] + "\t";
                }
                else if( y + x >= max && x >= y)  //Kanan
                {
                        data[x][y]= fib1[n-x-1] + "\t"; 
                } 
            }
        }

        return data;
    }
    
    public void showData(int n){
        String[][] data = setData(n);

        for(int y = 0; y < n; y++){
            for(int x= 0; x < n; x++){
                 if(data[x][y]==null  ){
                	data[x][y]=" \t";
                }
                	
                
                System.out.print(data[x][y]);
            }
            
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) throws IOException {
    	InputStreamReader nilai = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(nilai);
		System.out.println("Masukan Angka : ");
		String angka = br.readLine();
		int n = Integer.parseInt(angka);
		
		Soal9 soal = new Soal9();
		soal.showData(n); // set nilai yang ditampilkan
    }
}

