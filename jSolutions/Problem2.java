import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem3 {
	
	static String[][] square = new String[4][4];
	static Integer[][] Numb = new Integer[4][4];
	static int[] row = new int[4];
	static int[] column = new int[4];
	static int a = 0;			

	public static void main(String[] args) {
							
		Scanner scan = new Scanner(System.in);
		StringTokenizer StrTok = new StringTokenizer(scan.nextLine());
		StringTokenizer StrTok2 = new StringTokenizer(scan.nextLine());
		StringTokenizer StrTok3 = new StringTokenizer(scan.nextLine());
		StringTokenizer StrTok4 = new StringTokenizer(scan.nextLine());
																			
		for (int i = 0; i < 4; i++) {
			square[0][i] = StrTok.nextToken();
			square[1][i] = StrTok2.nextToken();
			square[2][i] = StrTok3.nextToken();
			square[3][i] = StrTok4.nextToken();	
		}
																			
		for (int j = 0; j < 4; j++) {
			for (int l = 0; l < 4; l++) {
					Numb[j][l] = Integer.parseInt(square[j][l]);
			}
		}

		for (int j = 0; j < 4; j++) {
					row[j] = Numb[j][0] + Numb[j][1] + Numb[j][2] + Numb[j][3];
								column[j] = Numb[0][j] + Numb[1][j] + Numb[2][j] + Numb[3][j];
										}
												
		if (column[0] == column[1] && column[1] == column[2] && column[2] == column[3] && column[3] == column[0]) {
			if (row[0] == row[1] && row[1] == row[2] && row[2] == row[3] && row[3] == row[0]) {
				if (row[0] == column[0]) {
						System.out.println("magic");
				} else {
					a += 1;
				}
			} else {
				a += 1;
			} 
		} else {
			a +=1;
		}
		if (a>0) {
			System.out.println("not magic");
		}
	}
}
