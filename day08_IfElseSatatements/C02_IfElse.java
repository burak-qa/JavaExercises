package day08_IfElseSatatements;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        //1- Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dikdortgenin bir kenar uzunlugunu giriniz :");
		double a=scan.nextDouble();
		System.out.println("dikdortgenin diger kenar uzunlugunu giriniz :");
		double b=scan.nextDouble();
		
		if (a!=b) {
			System.out.println("bu bir dikdortgendir");
			
		} else {
			System.out.println("bu bir karedir!");

		}
		scan.close();
    }
}
