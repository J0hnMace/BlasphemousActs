import java.util.Scanner;
import java.io.*;

public class HappySad { //Open Class Brace

	public static void main(String[] args) { //Open main method brace

		try { //Open try Loop

		Scanner fileReader = new Scanner(new File("happysad.txt"));

		String lineIn = fileReader.nextLine();

			if (lineIn.indexOf(":-)") < (lineIn.indexOf(":-("))) { //What the hell?
				System.out.println("happy");
			}
			else if (lineIn.indexOf(":-)") > (lineIn.indexOf(":-("))) { //These operators are weird, man
				System.out.println("sad");
			}
			else {
				System.out.println("unsure");
			}
		
		} //Close Try loop

		catch (IOException e) {
			System.out.println("File not found");
		}

	} //Close Main Method brace

} //Close class brace