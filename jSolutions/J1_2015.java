import java.util.Scanner;
import java.io.*;

public class SpecialDay {

	public static void main(String[] args) {

		Scanner textReader = new Scanner(new file("specialday.txt"));

		int month = Integer.parseInt(textReader.nextLine());
		int date = Integer.parseInt(textReader.nextLine());
		
		if ((month <= 2 && date <= 18) || (month <= 2 && date >= 18)) {
			System.out.println("Before");
		}
		else if ((month >= 2 && date >= 18) || (month >= 2 && date <= 18)) {
			System.out.println("After");
		}
		else {
			System.out.println("Special");
		}

	}

}