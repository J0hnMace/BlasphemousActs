import java.util.Scanner;
import java.io.*;
 
//Antonia's dice is the first number on the line after the first line

public class DoubleDice {

	public static void main(String[] args) {

		try {

		Scanner fileReader = new Scanner(new File("doubledice.txt"));

		int rounds = fileReader.nextInt();

		int score_Antonia = 100;
		int score_David = 100;

		for (int i = 0;i < rounds; i++) {
			int diceAntonia = fileReader.nextInt();	
			int diceDavid = fileReader.nextInt();

			if (diceAntonia > diceDavid) {
				score_David -= diceAntonia;
			}
			else if (diceDavid > diceAntonia) {
				score_Antonia -= diceDavid;
			}
		}

		System.out.println("Antonia's Score is " + score_Antonia);
		System.out.println("David's Score is " + score_David);
	}

	catch (IOException e) {
		System.out.println("File Missing");
	}

	}
}