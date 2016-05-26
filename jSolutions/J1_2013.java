import java.util.Scanner;
import java.io.*;

public class NextInLine { //Open class brace

	public static void main(String[] args) { //Open Main brace

		try { //Open try brace
				
			Scanner fileReader = new Scanner(new File("next.txt"));

			int young = Integer.parseInt(fileReader.nextLine());
			int middle = Integer.parseInt(fileReader.nextLine());

			int differance = (middle - young);				
			int resultant = (middle + differance);
			System.out.println(resultant);

			} //Close try brace

			catch (IOException e) { //Open catch brace
				System.out.println("File Not Found");
			
			} //Close catch brace
		} //Close main brace
	} //Close class brace