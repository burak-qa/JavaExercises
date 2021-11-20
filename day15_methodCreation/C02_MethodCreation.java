package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		//soru 2)  Kullaniciya kac sayi toplamak istedigini sorun. 
		// Kullanici 2,3 veya 4 degerini girerse, 
		//kullanicidan bu sayilari girmesini isteyin 
		//ve sayilarin toplamini yazdirin. 
		//Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		//“Cok sayi girdiniz, ben toplayamam” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen toplamak istediginiz sayi adedini 2,3 veya 4 den biri olarak secin");
		
		
		int
		tercih=scan.nextInt();
		if(tercih>4) {
			tercih=5;
		}
		
		
		switch(tercih) {
		case 2: 
			ikiSayiT();
			break;
		case 3:
			ucsayiT();
			break;
		case 4:
			dortSayiT();
			break;
		case 5:
			System.out.println("Cok sayi girdiniz, ben toplayamam");
			break;
		default: 
			System.out.println("gecersiz tercih");
		}
		scan.close();
		
	}

	private static void ikiSayiT() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin\nHer sayidan sonra enter'a basin");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		System.out.println("Girdiginiz iki sayinin toplami : " + (num1+num2));
		
		scan.close();
	}

	private static void ucsayiT() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc sayi girin\nHer sayidan sonra enter'a basin");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		System.out.println("Girdiginiz uc sayinin toplami : " + (num1+num2+num3));
		
		scan.close();
		
	}

	private static void dortSayiT() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort sayi girin\nHer sayidan sonra enter'a basin");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		double num4=scan.nextDouble();
		System.out.println("Girdiginiz dort sayinin toplami : " + (num1+num2+num3+num4));
		
		scan.close();
		
	}

}
