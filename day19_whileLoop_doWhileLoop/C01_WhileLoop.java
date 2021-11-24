package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// soru 6- kullanicidan bir sayi alin
		// ve bu sayiyi tam bolen sayilari
		// ve toplam kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tam sayi giriniz");
		int num = scan.nextInt();

		int counter = 0;
		int dividing = 1;

		while (dividing <= num) {
			if (num % dividing == 0) {
				System.out.print(dividing + " ");
				counter++;

			}
			dividing++;
		}
		System.out.println("");
		System.out.println(num + " sayisinin " + counter+ " adet tam boleni vardir");
		scan.close();
	}

}
