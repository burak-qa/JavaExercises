package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C06a_NestedTernary {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin
		//kucuk harf ise consola "Kucuk Harf"
		//buyuk harf ise consola "Buyuk Harf"
		//yoksa "girdiginiz karakter harf degil" yazdirin

		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz..");
        char karakter=scan.next().charAt(0);
        
        System.out.println((karakter>='a' && karakter<='z') ? "Kucuk harf" : (karakter>='A' && karakter<='Z') ? "Buyuk Harf" : "Girdiginiz karakter harf degil");
        
        
        scan.close();
    }
}
