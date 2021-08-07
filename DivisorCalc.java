/*Sravani Birudukota
 Programming fundamentals
 Summer
lab 5 Exercise #3
*/

import java.util.Scanner;

public class DivisorCalc {
	public static int gcd(int num1, int num2) {
		if (num2 != 0)
			return gcd(num2, num1 % num2);
		else
			return num1;
	}

	public static void main(String args[]) {
		int m, n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for m: ");
		m = in.nextInt();
		System.out.print("Enter value for n: ");
		n = in.nextInt();
		System.out.println("GCD = " + gcd(m, n));
	}
}
