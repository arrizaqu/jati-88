package com.xsis.bt88.logic.day3;

import java.util.Scanner;

public class SoalKPK {
	

	public static void main(String[] args) {
		int n, m , cad, faktor, sisa; 
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan bilangan pertama : ");

		m=input.nextInt();

		System.out.println("masukkan bilangan kedua : ");
		n=input.nextInt();
		if (m<n)

		{

		cad=m;

		m=n;

		n=cad;

		}

		faktor=1;

		for (int i=2;i<=n;i++)

		{

		sisa=n%i;

		if (sisa==0)

		for(int j=2;i<=m;j++)

		{

		if ((m%j)==0)

		if(i==j)

		faktor=j;

		break;

		}

		}

		System.out.println("KPK="+(m*n/faktor));

		

		
		}}
	
