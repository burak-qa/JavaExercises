package day02_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
		// Scanner isleminde string icin 2 method vardir
		//scan.next() dedigimizde sadece 1 kelime alir
		//eger kullanicidan daha fazla kelime gelme ihtimali varsa 
		//scan.nextLine() kullanmaliyiz
		
		// Kullanicidan isim ve soyismini ayri ayri isteyip 
		//girilen ismi asagidaki gibi yazdirin
		
		// girilen isim: Burak Sarisahin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yaziniz...");
		
		String name=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi yaziniz...");
		
		String surname=scan.nextLine();
		
		System.out.println("Girilen isim: " + name + " " + surname );
		
		scan.close();
	}
}
