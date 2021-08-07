/*Sravani Birudukota
 Programming fundamentals
 Summer
lab 5 Exercise #2
*/

import java.util.Scanner;
import java.io.*;

public class EX2 {

	public static void main(String[] args) throws IOException {

		String userInput = "";

		String file = "userStrings.txt";

		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		while (!userInput.equalsIgnoreCase("done")) {
			try {
				System.out.print("Please enter your string: ");
				userInput = scan.nextLine();

				if (userInput.equalsIgnoreCase("done")) {
					outFile.close();
				}

				outFile.print(userInput);
			} catch (NumberFormatException exception) {
				System.out.print("Please provide correct input.");
			}

		}
		scan.close();
	}
}