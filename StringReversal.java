
/*Sravani Birudukota
 Programming fundamentals
 Summer
lab 5 Exercise #4
*/
import java.util.Scanner;

public class StringReversal {
	void reverseString(String string) {
		if ((string == null) || (string.length() <= 1))
			System.out.println(string);
		else {
			System.out.print(string.charAt(string.length() - 1));
			reverseString(string.substring(0, string.length() - 1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		StringReversal obj = new StringReversal();
		obj.reverseString(s);
	}
}
