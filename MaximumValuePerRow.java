
/*Sravani Birudukota
 Programming fundamentals
 Summer
lab 5 Exercise #1
*/
import java.util.Scanner;
import java.io.*;

public class MaximumValuePerRow {

	public static void main(String args[]) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input.csv"));

		String line = "";

		int large = 0, count = 1;

		String[] arr = null;

		System.out.println("Maximum values");

		while (input.hasNext())

		{

			line = input.nextLine();

			arr = line.split(",");

			large = 0;

			for (int i = 0; i < arr.length; i++)

			{

				if (Integer.parseInt(arr[i]) > large)

					large = Integer.parseInt(arr[i]);

			}

			System.out.println("ROW " + count + " : " + large);

			count++;

		}
		input.close();
	}

}
