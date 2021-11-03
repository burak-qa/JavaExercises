package day09_nestedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        // 12- Kullanicidan 4 basamakli bir sayi girmesini isteyin.
		//Girdiginiz sayi 5'e bolunuyorsa son rakami kontrol edin. 
		//Son rakami 0 ise ekrana "5'e bolunen cift sayi" yazdirin
		//Son rakam 0 degil ise "5'e bolunen tek sayi"yazdirin.
		//Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamakli pozitif bir sayi giriniz..");
		int num=scan.nextInt();
		
		if (num>=1000 && num<10000) { 	                            //4 basamakli sayilari yakalayacak. 
			if (num%5==0) {               							//bese tam bolunenler
				if (num%10==0) {           							//son rakam 0
					System.out.println("5'e bolunen cift sayi"); 	//bese tam bolunen cift sayi
				} else {											//son rakam 5
					System.out.println("5'e bolunen tek sayidir");
				}
			} else { 												 //bese tam bolunemeyenler
				System.out.println("Tekrar deneyin");
			}
			
		} else {
			System.out.println("Lutfen 4 basamakli  bir sayi giriniz!");
		}
		
		
		/*2. cozum yolu
		 * if(num<1000 || num>9999){   burada OR kullanarak iki alani sectik(tek alani secersek AND kullaniriz
		 * System.out.println("4 basamakli sayi girmelisiniz");
		 * }else {
		 * if(num%5==0){
		 * if(num%10==0){
		 * System.out.println("bese tam bolunen cift sayi");
		 * }else{
		 * System.out.println("5'e bolunen tek sayidir");
		 * }
		 * } else {
		 * System.out.println("Tekrar deneyin");
		 * }
		 * }*/
		
        System.out.println("******** Ternary Cozum ********");
        System.out.println((num<1000 || num>9999) ? "4 basamakli bir sayi girmelisiniz" : 
        (num%5==0)? (num%10==0? "5'e bolunen cift sayi" : "5'e bolunen tek sayidir"):"Haci tekrar dene");
		
		scan.close();
    }
}
