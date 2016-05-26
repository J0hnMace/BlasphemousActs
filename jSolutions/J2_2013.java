import java.util.Scanner;
import java.io.*;

//I, O, S, H, Z, X, and N are accepted. All else is not

public class RotatingLetters {

	public static void main(String[] args) {

		Scanner lineReader = new Scanner(System.in);

		String userInput = lineReader.nextLine();

		char[] usableLetters = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};

		for (int i = 0; i < userInput.length(); i++) {

			char current_char = userInput.charAt(i);
			
			int counter = 0;
			
			for (int n = 0; n < usableLetters.length; n++) {
				if (current_char == usableLetters[i]) {
					counter ++;
				}
			}

			if (counter == 0) {
				System.out.println("No");
				System.exit(0);
			}
			
		}

	}

}

// if (!(Arrays.asList(usableLetters).contains(current_char))) {
// 	System.out.println("No");
// 	System.exit(0);
// }