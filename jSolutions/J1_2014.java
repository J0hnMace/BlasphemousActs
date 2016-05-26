import java.util.Scanner;
import java.io.*;

public class TriangleTimes {

	public static void main(String[] args){

		Scanner textReader = new Scanner(new file("TriangleText.txt"));

		int a = Integer.parseInt(textReader.nextLine());
		int b = Integer.parseInt(textReader.nextLine());
		int c = Integer.parseInt(textReader.nextLine());

		if (a + b + c != 180) {
			System.out.println("Error");
		}
		else if (a == b && b == c) {
			System.out.println("Equilateral");
		}
		else if (a == b || a == c || b == c) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}

		catch (IOexception e) {
			System.out.println("Error reading file");
		}

	}

}