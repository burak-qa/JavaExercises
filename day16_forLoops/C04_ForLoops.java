package day16_forLoops;

import java.util.Scanner;

public class C04_ForLoops {

	public static void main(String[] args) {
		// Question 4) Ask the user for an integer less than 100.
		// Print numbers that are multiples of 3 from 1 to the number entered.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer less than 100... :");

		double num = scan.nextDouble();
		int num1 = (int) num;
		// sayi negatif ise veya tam sayi degilse uyari verelim

		if (num < 0) {
			System.out.println("Lutfen pozitif bir sayi giriniz!");
		} else if (num1 != num) {
			System.out.println("Lutfen tam bir sayi giriniz!");
		} else if (num1 > 100) {
			System.out.println("Lutfen 100'den kucuk bir sayi giriniz!");
		} else {
			for (int i = 1; i < num; i++) {
				if (i % 3 == 0) {
					System.out.print(i + " ");
				}

			}
		}

		System.out.println();
		System.out.println("****Basit cozum****");

		for (int i = 1; i < num; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}

		scan.close();
	}

}
