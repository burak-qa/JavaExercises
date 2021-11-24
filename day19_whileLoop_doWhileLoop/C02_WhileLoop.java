package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// soru 7 kullanicidan bir sayi alin 
		// ve busayinin rakamlaritoplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tam sayi giriniz ");
		int num=scan.nextInt();
		
		int sumNum1=0;
		int num1=0;
		
		while (num>0) {
			num1=num%10;
			sumNum1+=num1;
			num/=10;
			
		}
		System.out.println("girdiginiz sayinin rakamlar toplami : " + sumNum1);
		
		
		scan.close();
		
		
	}

}
