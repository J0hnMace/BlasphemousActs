import java.util.Scanner;
import java.io.*;

//Every consonant is replaced by 3 letters. Let's use d as an example
//	1. The consonant itself (d -> d)
//	2. The vowel closest to the consonant (d -> de)
//	3. The nese consonant in the alphabet (d -> def). In the case of Z; Z will remain Z

public class Rovarspraket { //Open Class brace

	public static void main(String[] args) { //Open main method brace

		char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};

		Scanner lineReader = new Scanner(System.in); 

		System.out.println("Enter the word you would like transleted");

		String userInput = lineReader.nextLine();

		for (int s = 0; s > userInput.length(); s++) { //Open for-current_character loop brace
							
			char current_character = userInput.charAt(s);

		} //Close for for-current_character loop brace

			boolean isConsonant = false;
			for (char current_character : consonants) { //Open for-CharChecker loop
			    if (current_character == consonants[1]) { //Open CharChecker 
			        isConsonant = true;
			       	System.out.println("really man?");
			    }
			
			else {
				System.out.println("This is so many levels of wrong");
			}
		}
	} 
} //Close Class brace