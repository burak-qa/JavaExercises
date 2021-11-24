package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tam sayi giriniz ");
		int num = scan.nextInt(); //345 data turu int

		int sumNum1 = 0;
		int num1 = 0;
		
		sumNum1 = 0;
		String numStr = "" + num; //345 data turu String 
		//int olarak verilen bir sayinin basamak sayisini bulmak istersek
		//kisa yoldan o sayiyi String'e cevirip, str.length() method'unu kullanabiliriz
		
		for (int i = 0; i < numStr.length(); i++) {
			num1 = num % 10;
			sumNum1 += num1;
			num /= 10;

		}
		System.out.println("girdiginiz sayinin rakamlar toplami : " + sumNum1);
		scan.close();
	}

}
