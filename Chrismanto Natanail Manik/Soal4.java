package com.exis.logic.hari3;

import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {  
        int i,j;
        boolean pr; 
        Scanner input = new Scanner(System.in);  
        System.out.println("Masukan Banyaknya Batas Bilangan Prima = ");  
        int batas = input.nextInt();  
        int hasil = 0;  
  
        for(i=1;i<=batas;i++){   
{  
pr=false;  
if (i==2)  
pr=true;  
else  
{  
for (j=2;j<i;j++)  
    {  
if (i%j==0)  
        {  
pr=false;  
break;  
        }  
else  
pr=true;  
    }  
}  
  
if (pr)  
{  
System.out.printf(i+",");  
}  
            }  
        }  
    }
}
