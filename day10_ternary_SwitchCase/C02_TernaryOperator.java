package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C02_TernaryOperator { 
    public static void main(String[] args) {
        //2- Kullanicidan bir tam sayi alin ve sayinin tek veya cift oldugunu yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("bir tam sayi giriniz..");
		int num=scan.nextInt();
		
		System.out.println(num%2==0 ? "bu bir cift sayidir" : "bu bir tek sayidir");
		
		scan.close();
    }
}
