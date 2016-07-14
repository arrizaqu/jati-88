package day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Soal_5 {
	
	public static void main(String args[]) {
		BigInteger x;
		BigInteger y;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("angka 1: ");
			x = new BigInteger(br.readLine());
			System.out.print("angka 2: ");
			y = new BigInteger(br.readLine());
			System.out.print("fpb: ");
			System.out.println(x.gcd(y));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
