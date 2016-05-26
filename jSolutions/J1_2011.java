import java.util.Scanner;
import java.io.*;

// Problem information
// Alien TroyMartian has at least 3 antenna and at most 4 eyes
// Alien VladSaturnian has at most 6 antenna and at least 2 eyes
// Alien GraemeMercurian has at most 2 antenna and at most 3 eyes

public class WhichAlien3 {

	public static void main(String[] args) {

		Scanner lineReader = new Scanner(System.in);
		System.out.println("How many antenna?");
		int readAntenna = lineReader.nextInt();
		System.out.println("How many eyes");
		int readEyes = lineReader.nextInt();

		if (readAntenna >= 3 && readEyes <= 4) {
			System.out.println("Troy Martian");
		}
		if (readAntenna <= 6 && readEyes >= 2) {
			System.out.println("Vlad Saturnian");
		}
		if (readAntenna <=2 && readEyes <= 3) {
			System.out.println("Graeme Mercurian");
		}

	}

}