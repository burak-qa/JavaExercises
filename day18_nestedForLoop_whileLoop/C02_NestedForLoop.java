package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10 dan kucuk pozitif bir tam sayi girmesini isteyin
		// girdigi sayiya gore asagidaki sekli yazdirin
		// ornek : 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk pozitif bir tam sayi giriniz :");
		int num = scan.nextInt();

		for (int satir = 1; satir <= num; satir++) {
			for (int i = 1; i <= satir; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}

		scan.close();
	}

}
