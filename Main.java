// Main class for CS contest problems

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

	public static Scanner userInput = new Scanner(System.in);
	
	public static String consoleInput(String str) {
		System.out.println(str);
		return userInput.next();
	}

	public static Scanner fileInput;

	public static void readFile(String fileName) {
		try {
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!");
		}
	}

	public static void initAll() {
		System.out.print("=========================================");
		System.out.println("=======================================");
		// readFile("Data.txt"); // Capital letters do not matter, for some reason

		/*
		CCC_2013_J3(); // Failure by input (9000, etc.)
		CCC_2002_J1(); // Success, remember need to declare variables first
		CCC_2010_J1(); // Success, too easy
		CCC_2010_J2(); // Success, bit of math
		CCC_2016_J4(); // Success, bit of logic
		CCC_2016_J5(); // Success, easy math
		*/

		// CCC_2016_J1(); // Incomplete
		//CCC_2016_J3(); // ...

		 CCC_2013_S2();
		//CCC_2016_S3(); // not finished, too hard

		
	}
//======================================\\					
	// public static void CCC_2016_S3() {
	// 	System.out.println("Problem S3: Phonomenal Reviews");
	// 	// read in data
	// 	readFile("CCC_2016_S3.txt");
	// 	int N = fileInput.nextInt();
	// 	int M = fileInput.nextInt();
	// 	int[] M = new int[M];
	// 	for (int n = 0; n < M; n++) {
	// 		M[n] = fileInput.nextInt();
	// 	}
	// 	int[][] R = new int[N-1][2];
	// 	for (int n = 0; n < R.length; n++) {
	// 		R[n][0] = fileInput.nextInt();
	// 		R[n][1] = fileInput.nextInt();
	// 	}
	// 	// compute like crazy
	// 	for (int n = 0; n < M; n++) {
	// 		// two-phase; but Y arrangement? need looped path // TOOOO HARD!!!! TRAVELLING SALESMAN
	// 	}
	// }
//======================================\\					fuqqqqqqqqqqq!!
	public static void CCC_2013_S2() {
		// Bridge transport

		readFile("CCC_2016_S2.txt");
		int W = fileInput.nextInt();
		int N = fileInput.nextInt();
		int[] w = new int[N];
		for (int n = 0; n < N; n++) {
			w[n] = fileInput.nextInt();
		}
		boolean fuq = true;
		for (int i = 0; i < N-3; i++) {
			if (w[i] + w[i+1] + w[i+2] + w[i+3] > W) {
				System.out.println(i);
				fuq=false;
			}
		}
		if (fuq==true) {
			System.out.println(N);
		}

		// inefficient try a realer approac=[]\''

		

	}
//======================================\\
	public static void CCC_2016_J1() {
		// This is a joke...
	}
//======================================\\					40 min approx, doesn't work!
	public static void CCC_2016_J3() {
		readFile("CCC_2016_J3.txt");
		while (fileInput.hasNextLine()) {
			String[] letters = fileInput.nextLine().trim().split("");
			int palindromeCounter = 0;
			int greatestPalindromeCounter = 0;
			for (int i = 0; i < letters.length; i++) {
				System.out.print(letters[i]);
				palindromeCounter = 0;
				for (int j = 0; j < letters.length; j++) {
					palindromeCounter++; // THIS IS srsly UNNEDED BUT SERIOUS PROBLEM: 
					if (i-j >= 0 && i+j < letters.length) {
						if (letters[i-j] == letters[i+j]) {
							palindromeCounter++;
							System.out.print(palindromeCounter);
							//System.out.print(letters[i-j]+"=");
							//System.out.println(letters[i+j]);
						}
					}
					if (palindromeCounter > greatestPalindromeCounter) {
						greatestPalindromeCounter = palindromeCounter;
					}
					//System.out.println( );
				}
			}
			System.out.println(greatestPalindromeCounter);
		}
	}
//======================================\\						// 37 minutes to complete - this was death
	public static void CCC_2016_J4() {

		// read input
		String[] departureTime = consoleInput("Input departure time in form HH:MM").split(":");
		int departureHour = Integer.parseInt(departureTime[0]);
		int departureMinute = Integer.parseInt(departureTime[1]);

		int arrivalInMinutes;

		// determine rush values
		int departureInMinutes = departureHour * 60 + departureMinute;

		if (departureInMinutes > 24*60) {
			departureInMinutes = departureInMinutes % (24*60);
		}

		if (departureInMinutes >= 7*60 && departureInMinutes <= 10*60) {
			arrivalInMinutes = departureInMinutes + 2*60 + ((10*60 - departureInMinutes) / 2); // if departureInMinutes == 10*60, rounds up time by minute
		} else if (departureInMinutes >= 5*60 && departureInMinutes <= 7*60) {
			arrivalInMinutes = departureInMinutes + 2*60 + (departureInMinutes - 5*60) * 2;
		}

		else if (departureInMinutes >= 15*60 && departureInMinutes <= 19*60) {
			arrivalInMinutes = departureInMinutes + 2*60 + ((19*60 - departureInMinutes) / 2); // if departureInMinutes == 19*60, rounds up time by minute
		} else if (departureInMinutes >= 13*60 && departureInMinutes <= 15*60) {
			arrivalInMinutes = departureInMinutes + 2*60 + (departureInMinutes - 13*60) * 2;
		}

		else {
			arrivalInMinutes = departureInMinutes + 2*60;
		}

		// convert to output format
		int arrivalHour = (arrivalInMinutes / 60);

		if (arrivalHour < 10) {
			System.out.print("0" + arrivalHour + ":");
		} else if (arrivalHour <= 24) {
			System.out.print(arrivalHour + ":");
		} else {
			System.out.print((arrivalHour % 24) + ":");
		}

		int arrivalMinute = (arrivalInMinutes % 60);

		if (arrivalMinute < 10) {
			System.out.println("0" + arrivalMinute);
		} else {
			System.out.println(arrivalMinute);
		}
		
	}
//======================================\\					// 42 minutes to complete, debug array out of bounds, debug split input 30 minutes to complete
	public static void CCC_2016_J5() {

		// read in data
		readFile("CCC_2016_J5.txt");
		while (fileInput.hasNextLine()) {
			int question = Integer.parseInt(fileInput.nextLine());// consoleInput("Enter question number (1 or 2): ");
			int numberCitizens = Integer.parseInt(fileInput.nextLine());//consoleInput("Enter number of pairs of citizens: ")
			String[] dmojistanString = fileInput.nextLine().split(" ");
			String[] peglandString = fileInput.nextLine().split(" ");
			int[] dmojistan = new int[dmojistanString.length]; // [numberCitizens];
			int[] pegland = new int[peglandString.length]; // [numberCitizens];
			for (int i = 0; i < numberCitizens; i++) {
				dmojistan[i] = Integer.parseInt(dmojistanString[i]);
				pegland[i] = Integer.parseInt(peglandString[i]);
			}

			Arrays.sort(dmojistan);
			Arrays.sort(pegland);
			int totalSpeed = 0;

			if (question == 1) {
				// System.out.println("Question 1: what is the minimum total speed, out of all possible assignments into pairs?");
				for (int i = 0; i < numberCitizens; i++) {
					if (dmojistan[i] > pegland[i]) {
						totalSpeed = totalSpeed + dmojistan[i];
					} else {
						totalSpeed = totalSpeed + pegland[i];
					}
				}
			}

			else if (question == 2) {
				// System.out.println("Question 2: what is the maximum total speed, out of all possible assignments into pairs?");
				for (int i = 0; i < numberCitizens; i++) {
					if (dmojistan[i] > pegland[numberCitizens-i-1]) {
						totalSpeed = totalSpeed + dmojistan[i];
					} else {
						totalSpeed = totalSpeed + pegland[numberCitizens-i-1];
					}
				}
			}
			System.out.println(totalSpeed);
		}
	}
//======================================\\
	public static void CCC_2010_J2() {
		int a; int b; int c; int d; int s;
		int nCyc; int nRem; int nExt; int nLoc;
		int bCyc; int bRem; int bExt; int bLoc;
		
		// input data
		a = Integer.parseInt(consoleInput("Enter A: "));
		b = Integer.parseInt(consoleInput("Enter B: "));
		c = Integer.parseInt(consoleInput("Enter C: "));
		d = Integer.parseInt(consoleInput("Enter D: "));
		s = Integer.parseInt(consoleInput("Enter S: "));

		// determine output
		nCyc = s/(a+b);
		nRem = s%(a+b);
		if (nRem<a) {
			nExt = nRem;
		} else {
			nExt = 2*a-nRem;
		}
		nLoc = nCyc*(a-b)+nExt;

		bCyc = s/(c+d);
		bRem = s%(c+d);
		if (bRem<a) {
			bExt = bRem;
		} else {
			bExt = 2*c-bRem;
		}
		bLoc = bCyc*(c-d)+bExt;

		/* This is compressed code of above
		nRem = s%(a+b);
		if (nRem<a) {
			nLoc = s/(a+b)*(a-b)+nRem;
		} else {
			nLoc = s/(a+b)*(a-b)+2*a-nRem;
		}
		bRem = s%(c+d);
		if (bRem<a) {
			bLoc = s/(c+d)*(c-d)+bRem;
		} else {
			bLoc = s/(c+d)*(c-d)+2*c-bRem;
		}
		
		*/

		// print output
		if (nLoc>bLoc) {
			System.out.println("Nikky");
		} else if (nLoc<bLoc) {
			System.out.println("Byron");
		} else {
			System.out.println("Tied");
		}
	}

//======================================\\
	public static void CCC_2010_J1() {

		int answers = 0;
		int n;

		// input data
		while (true) {
			n = Integer.parseInt(consoleInput("Enter a number N between 1 and 10:"));
			if (n>0 && n<=10) {
				break;
			} else {
				System.out.println("Invalid input for N, try again.");
			}
		}

		// determine output
		for (int i=-1; i<n/2; i++) {
			answers++;
		}

		// print output
		System.out.println(answers);
	}

//======================================\\
	public static void CCC_2002_J1() {

		boolean[] seg = new boolean[7];
		int num;

		// input data
		while (true) {
			num = Integer.parseInt(consoleInput("Enter a digit between 0 and 9:"));
			if (num>=0 && num<10) {
				break;
			} else {
				System.out.println("Invalid input, try again.");
			}
		}

		// output data
		if (num==0) {
			seg = new boolean[] {true,true,true,false,true,true,true};
		} else if (num==1) {
			seg = new boolean[] {false,false,true,false,false,true,false};
		} else if (num==2) {
			seg = new boolean[] {true,false,true,true,true,false,true};
		} else if (num==3) {
			seg = new boolean[] {true,false,true,true,false,true,true};
		} else if (num==4) {
			seg = new boolean[] {false,true,true,true,false,true,false};
		} else if (num==5) {
			seg = new boolean[] {true,true,false,true,false,true,true};
		} else if (num==6) {
			seg = new boolean[] {true,true,false,true,true,true,true};
		} else if (num==7) {
			seg = new boolean[] {true,false,true,false,false,true,false};
		} else if (num==8) {
			seg = new boolean[] {true,true,true,true,true,true,true};
		} else if (num==9) {
			seg = new boolean[] {true,true,true,true,false,true,true};
		}

		// print output
		if (seg[0]==true) {
			System.out.println(" *** ");
		} else {
			System.out.println("     ");
		}
		if (seg[1]==true) {
			if (seg[2]==true) {
				System.out.print("*   *\n*   *\n*   *\n");
			} else {
				System.out.print("*    \n*    \n*    \n");
			}
		} else {
			if (seg[2]==true) {
				System.out.print("    *\n    *\n    *\n");
			} else {
				System.out.print("    *\n    *\n    *\n");
			}
		}
		if (seg[3]==true) {
			System.out.println(" *** ");
		} else {
			System.out.println("     ");
		}
		if (seg[4]==true) {
			if (seg[5]==true) {
				System.out.print("*   *\n*   *\n*   *\n");
			} else {
				System.out.print("*    \n*    \n*    \n");
			}
		} else {
			if (seg[5]==true) {
				System.out.print("    *\n    *\n    *\n");
			} else {
				System.out.print("    *\n    *\n    *\n");
			}
		}
		if (seg[6]==true) {
			System.out.println(" *** ");
		} else {
			System.out.println("     ");
		}
	}

//======================================\\
	public static void CCC_2013_J3() {
		
		while (true) { // start infinite loop

		int y = Integer.parseInt(consoleInput("Enter start year Y such that (0 ≤ Y ≤ 10000): "));
		int a = y/1000;
		int b = (y-a*1000)/100;
		int c = (y-a*1000-b*100)/10;
		int d = (y-a*1000-b*100-c*10);

		if (y>10000) {
			System.out.println("Operation error, Y > 10000");
			System.exit(0);
		}

		if ((y==0)||(y<100&&c!=d)||(a!=b&&a!=c&&a!=d)) {
			d++;
		}
		
		if (a!=0&&a==b) {
			b=b+1;
			if (a==c) {
				c=c+2;
				if (a==d) {
					d=d+3;
				}
			}
		} else if (a!=0&&b!=0&&b==c) {
				c=c+1;
				if (b==d) {
					d=d+2;
				}
		} else if (a!=0&&b!=0&&c!=0&&c==d) {
					d=d+1;
		}

		System.out.println("Operation complete, output D:");
		System.out.println(a*1000+b*100+c*10+d);

		}// end infinite loop
	}
	
	public static void main(String[] args) {
		initAll();
	}
}

