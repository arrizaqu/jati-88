package day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Soal_3 {

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
			System.out.print("kpk: ");
			System.out.println(x.multiply(y.divide(x.gcd(y))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
