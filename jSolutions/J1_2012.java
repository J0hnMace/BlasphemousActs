import java.util.Scanner;
import java.io.*;

public class SpeedFines2 { //Open class brace

	public static void main(String[] args) { //Open main method brace

		Scanner reciver = new Scanner(System.in);

		System.out.println("Enter the speed limit");
		int speedLimit = reciver.nextInt();
		System.out.println("Enter the recorded speed of your car");
		int driverSpeed = reciver.nextInt();
		int differance = driverSpeed - speedLimit;
		//System.out.println("Differnace between your speed and speed limit is " + differance);

		if (differance <= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		else if (differance > 0 && differance <= 20) {
			System.out.println("You are speeding and your fine is $100.");
		}
		else if (differance >= 21 && differance < 30) {
			System.out.println("You are speeding and your fine is $270.");
		}
		else if (differance >= 31) {
			System.out.println("You are speeding and your fine is $500.");
		} //Close last if statement brace

	} //Close main method brace

} //Close class brace