package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri 
		// 		ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		//ikinci method ise isim ve soyismin ilk harfleri buyuk harf kalan harfler * olacak sekide birlestirsin
		//		kullaniciya ismin acik olarak yazilmasi veya gizenmesi tercihini sorun ve
		//programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz : ");
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz : ");
		String soyIsim=scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
		+ "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");
		
	    int tercih=scan.nextInt();
	 
		String birlesmisIsim=null;  // Emrah Saglam, E**** S*****
		
		if (tercih==1) {
			birlesmisIsim=acikIsim(isim, soyIsim);
			
		} else if(tercih==2){
				birlesmisIsim=isimGizle(isim, soyIsim);
			} else {
				System.out.println("Lutfen 1 veya 2'yi secin");
			}
			//Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak kayit edildi
			
			System.out.println("kullanicinin tercihi : " + birlesmisIsim);
			scan.close();
		}

	public static String isimGizle(String isim, String soyIsim) {//eger yazdiracak deseydik void kalacakti / simdi void i String ile degistirdik
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyIsim=soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
		return isim+" "+soyIsim; 
		
		
	}

	public static String acikIsim(String isim, String soyIsim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyIsim=soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).toLowerCase();
		
		return isim+" "+soyIsim;
		
		
	}

}
