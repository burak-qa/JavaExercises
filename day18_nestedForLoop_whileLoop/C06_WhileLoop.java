package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	@SuppressWarnings("resource")//scan hata vermesin diye atadi
	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayilar isteyin
		// sayi adedi 10'u gecerse veya toplam 500'u gecerse
		// "Bu kadar sayi yeter"
		// ..adet sayi girdin, toplami..."yazdirin

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int counter = 0;
		for ( counter = 0; counter < 10 && sum < 500; counter++) {
			System.out.println("Lutfen sayi giriniz : ");
			int num = scan.nextInt();
			sum += num;
			
			
			

		}
		System.out.println("Bu kadar sayi yeter");
		System.out.println(counter + "adet sayi girdin, toplami " + sum);
		
		
	}

}
