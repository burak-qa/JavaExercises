package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devam edin
		// kullanicic sifira bastiginda,
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin

		// kullanicidan 5 sayi alin dese
		for (int i = 0; i <= 5; i++) {
			// kullanicidan bir deger alip, toplama eklerim
		}
			Scanner scan = new Scanner(System.in);
			// loop un icinde kullanacagim obje ve variable'lari
			// loop'dan once olusturmak daha guzeldir
			// cunku loopún icinde olusturursak,
			// loop her dondugunde yeni bir odje veya variable olusturur ve bu da hafizayi
			// doldurur

			int num = 100; // 0 harici bir rakam vermemiz gerekiyor
			int sum = 0;
			int counter = 0;

			while (num != 0) {
				System.out.println("Lutfen toplama eklemek icin bir tam sayi yazin \nbitirmek icin 0'a basin");
				num = scan.nextInt();
				sum += num;
				counter++;

			}

			//kullanici 0'a bastiginda loop islemini son kez yapip 
			//sonra basa donecek ve loop bitecek
			//0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden 
			//sifiri sayacá eklemek icin counter-1 yaptik
			System.out.println("girilen sayi adedi: " + (counter-1));
			System.out.println("girilen sayilarin toplami: " + sum);
			
			scan.close();
		}

	}


