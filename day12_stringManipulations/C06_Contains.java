package day12_stringManipulations;

import java.util.Scanner;

public class C06_Contains {
    public static void main(String[] args) {
        // Kullanicidan email adresini girmesini isteyin, mail @gmail.com
		//icermiyorsa "lutfen gmail mail adresi giriniz" @gmail.com ile bitiyorsa “Email adresiniz kaydedildi”
		// yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen email adresinizi giriniz...     : ");
		String email=scan.next();
		
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
		
		if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail mail adresi giriniz");
		} else{
			if (index==uzunluk-10) {
				System.out.println("Email adresiniz basari ile kayit edildi.");
			} else {
				System.out.println("lutfen yazimi kontrol ediniz");
			}
			
		}
		

		
		
		
		scan.close();
    }
}
