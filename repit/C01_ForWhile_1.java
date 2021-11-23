package repit;

import java.util.Scanner;

public class C01_ForWhile_1 {

	public static void main(String[] args) {
		// Ask user to enter a name and a character,
		// then check how many times the character is repeated in the name using loops
		// in the name
		// e.g:
		// char ch1= 'a' ;
		// String name =“John came late"
		// Expected Output: Number of a = 2

		Scanner scan = new Scanner(System.in);
		System.out.println("Please write a name : ");
		String name = scan.nextLine();
		System.out.println("Please write a character : ");
		char ch1 = scan.next().charAt(0);

		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			if(ch1==name.charAt(i)) {
				count++;
				
			}
		}
		System.out.println("Number of "+ ch1+ " = " + count);
		scan.close();
	}

}
