import java.util.Scanner;
import java.io.*;

public class VoteCount3 {

	public static void main(String[] args) {

		try {
			// Read file in
			Scanner textReader = new Scanner(new File("votes.txt"));
			
			int totalVotes = textReader.nextInt();
			textReader.nextLine();
			String votes = textReader.nextLine();

			int counter = 0;

			// Count occerounce/
			for (int i = 0; i < totalVotes; i++) {
				char current_vote = votes.charAt(i);

				if (current_vote == 'A') {
					counter++;
				}
			}

			// interpret
			if (counter > (totalVotes/2)) {
				System.out.println("A wins!");
			}
			else if (counter < (totalVotes/2)) {
				System.out.println("B wins!");
			}
			else {
				System.out.println("Tie");
			}
		}

		catch (IOException e) {
			System.out.println("Error reading file");
		}
	}
}