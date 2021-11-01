package day04;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
		//kullanicidan 3 basamakli bir sayi alip 
		//rakamlar toplamini yazdiran
		//bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int number= scan.nextInt();
				
		//number 573 olsun
		
		int subNumber = 0;
		int rakam=number%10; // bana birler basamagini verir rakam=3
		
		subNumber+=rakam; // rakamlar toplami 3 oldu
		
		//sayimiz hala 573
		// 3 ten kurtulmak istiyorum
		//cunku 3 ile isim bitti
		//sayiyi 57 haline getirin
		
		number /=10;
		
		//sayim artik 57
		//7 yi nasil alirim?
		
		rakam=number%10;
		
		subNumber+=rakam;
	
		
		
		//sayi hala 57
		//7 den de kurtulalim
		number/=10;
		//sayi artik 5
		
		subNumber+=number;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + subNumber );
        scan.close();
	}
}
