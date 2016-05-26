import java.util.Scanner;
import java.io.*;

public class SoundsFishy { //Open class brace

	public static void main(String[] args) { //Open Main Method brace

		try { //Open try loop

			Scanner fishFinder = new Scanner(new File("soundsfishy.txt"));

			int firstDepth = Integer.parseInt(fishFinder.nextLine());
			int secondDepth = Integer.parseInt(fishFinder.nextLine());
			int thirdDepth = Integer.parseInt(fishFinder.nextLine());
			int fourthDepth = Integer.parseInt(fishFinder.nextLine());

			if (firstDepth < secondDepth && secondDepth < thirdDepth && thirdDepth < fourthDepth) {
				System.out.println("Fish Rising");
			}
			else if (firstDepth > secondDepth && secondDepth > thirdDepth && thirdDepth > fourthDepth) {
				System.out.println("Fish Diving");
			}
			else if (firstDepth == secondDepth && secondDepth == thirdDepth && thirdDepth == fourthDepth) {
				System.out.println("Fish at constant depth");
			}
			else {
				System.out.println("No Fish");
			}

			System.out.println("Depths were "+firstDepth+", "+secondDepth+", "+thirdDepth+", "+fourthDepth+".");

		} //Close Try loop

		catch (IOException e) {
			System.out.println("File not found");
		}

	} //Close Main Method brace

} //Close class brace