package day02_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
		// Kullanicidan isim ve soyismini ayri ayri isteyip 
		//girilen ismi asagidaki gibi yazdirin
		
		// girilen isim: Burak Sarisahin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yaziniz...");
		
		String name=scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz...");
		
		String surname=scan.next();
		
		System.out.println("Girilen isim: " + name + " " + surname );
		scan.close();
		
	}
}
