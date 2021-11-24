package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin.
			 *  Girilen sifreyi asagidaki sartlara gore kontrol edin 
			 *  ve sifredeki hatalari yazdirin. 
			 *  Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
			 *  ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
			 *   - Sifre kucuk harf icermelidir 
			 *   - Sifre buyuk harf icermelidir
			 *   - Sifre ozel karakter icermelidir
			 *   - Sifre en az 8 karakter olmalidir.
		 */

		Scanner scan = new Scanner(System.in);
		String parol = "";
		boolean khk = false;
		boolean bhk = false;
		boolean okk = false;
		boolean uk = false;

		do {
			System.out.println("Lutfen bir sifre giriniz");
			parol = scan.nextLine(); // Burak

			khk = smallLet(parol);
			bhk = bigLet(parol);
			okk = specialKarak(parol);
			uk = lengthKont(parol);
		} while (!khk || !bhk || !okk || !uk);

		System.out.println("Sifreniz basarili bir sekilde kayit edildi");

		scan.close();
	}

	private static boolean lengthKont(String parol) {
		boolean uk = false;
		if (parol.length() >= 8) {
			uk = true;
		} else {
			System.out.println("Sifreniz en az 8 karakter olmalidir");
		}
		return uk;
	}

	private static boolean specialKarak(String parol) {
		boolean okk = false;
		String letters = "!@#$%^&*()_+=-/<>,.?|";
		for (int i = 0; i < parol.length(); i++) {
			if (letters.contains(parol.substring(i, i + 1))) {
				okk = true;
				break;
			}
		}
		if (!okk) {
			System.out.println("Sifreniz en az bir ozel karakter icermelidir");
		}
		return okk;
	}

	private static boolean bigLet(String parol) {
		boolean bhk = false;
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < parol.length(); i++) {
			if (letters.contains(parol.substring(i, i + 1))) {
				bhk = true;
				break;
			}
		}
		if (!bhk) {
			System.out.println("Sifreniz en az bir buyuk harf icermelidir");
		}

		return bhk;
	}

	public static boolean smallLet(String parol) {
		boolean khk = false;

		String letters = "abcdefghijklmnoprstuvyzqxw";
		for (int i = 0; i < parol.length(); i++) {
			if (letters.contains(parol.substring(i, i + 1))) {
				khk = true;
				break;// break kullanmamizin sebebi : soruda 1 tane kucuk harf olmasi yeterli
						// biz kucuk harfi bulduktan sonra kodu durdurmazsak
						// sonradan karsimiza cikacak buyuk harfler bizi yaniltir
			}

		}
		// bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa
		// khk=false
		if (!khk) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir");
		}
		return khk;
	}

}
