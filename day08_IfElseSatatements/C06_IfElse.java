package day08_IfElseSatatements;

import java.util.Scanner;

public class C06_IfElse {
    public static void main(String[] args) {
        //1- Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise
		//    gun isminin 1.,2. ve 3. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
		//    gun ismi gecerli degil ise "Gecerli bir gun ismini giriniz"yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir gun ismi yaziniz :");
		
		String day=scan.nextLine().toUpperCase();
		
		
		if (day.equals("PAZARTESI") || day.equals("SALI") || day.equals("CARSAMBA") 
				|| day.equals("PERSEMBE") || day.equals("CUMA") || day.equals("CUMARTESI") || day.equals("PAZAR")) {
			System.out.println((day.toUpperCase().charAt(0))+""+ (day.toLowerCase().charAt(1))+(day.toLowerCase().charAt(2)) );
		} else {
			System.out.println("Gecerli bir gun ismini giriniz!");
		}		
		
		
		scan.close();
    }
}
