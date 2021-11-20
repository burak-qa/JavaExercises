package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		//sayilarin karelerini ve kuplerini toplayip yazdiran iki method yazin
		//kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz :");
		int num1=scan.nextInt();
		
		System.out.println("Lutfen bir sayi daha giriniz :");
		int num2=scan.nextInt();	
		
		System.out.println("lutfen bir us giriniz :");
		int us=scan.nextInt();
		
		if (!(us==2 || us==3)) {
			System.out.println("Lutfen 2 veya 3 rakamlarindan birini giriniz!");
			
		} else {
			if (us==2) {
				kareT(num1, num2);
			} else {
				kupT(num1, num2);
			}
		}
		
		
		
		System.out.println("****Switch cozum****");
		
		switch(us){
		case 2:
			kareT(num1,num2);
			break;
		case 3: 
			kupT(num1,num2);
			break;
			default: 
				System.out.println("Lutfen 2 veya 3 yazin");
		}
		
		

		
		
		scan.close();
	}

	public static void kupT(int num1, int num2) {
		System.out.println("Sayilarin kuplerinin toplami : " + ((num1*num1*num1)+(num2*num2*num2)));
		
	}

	public static void kareT(int num1, int num2) {
		System.out.println("Sayilarin karelerinin toplami : " + ((num1*num1)+(num2*num2)));
		
	}

}
