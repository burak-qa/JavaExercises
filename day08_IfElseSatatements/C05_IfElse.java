package day08_IfElseSatatements;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {
        //4-Kullanicidan bir ucgenin uc kenarinin uzunlugunu alin eger uc kenar uzunlugu
		//birbirine esit ise ekrena "Eskenar ucgen" yazdirin. Diger durumlarda ekrana 
		//"Eskenar degil" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen ucgenin bir kenarini uzunlugunu giriniz :");
		
		double a=scan.nextDouble();
		
		System.out.print("Lutfen ucgenin diger kenar uzunlugunu giriniz :");
		
		double b=scan.nextDouble();
		
		System.out.print("Lutfen ucgenin son kenar uzunlugunu giriniz :");
		
		double c=scan.nextDouble();
		
		if (a==b && b==c) {
			System.out.println("Bu ucgen eskenar ucgendir");
		} else {
			System.out.println("Bu ucgen eskenar ucgen degildir!");

		}
		
		scan.close(); 
    }
    
}
