package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfSentences {
    public static void main(String[] args) {
        // 4- Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		//ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunluklarini girin");
		
		double kenar1= scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		if(kenar1==kenar2) {
			System.out.println("girilen dikdortgen kare");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdortgen kare degil");
		}
		
		scan.close();
    }
    
}
