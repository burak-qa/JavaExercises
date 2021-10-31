package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfSentences {
    public static void main(String[] args) {
        // 1- Kullanicidan bir tmsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz :");
		int num=scan.nextInt();
		
		if (num%2==0) {
			System.out.println("girdiginiz sayi cift bir sayi");
		}
		if (num%2==1) {
			System.out.println("girdiginiz sayi tek bir sayi");
			
		}
		
		scan.close();
    }
    
}
