package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C07_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplamak icin bircok sayi isteyin
		// kullanicinin girdigi sayilarin adedi 10'u gecerse veya
		// kullanicinin girdigi sayilarin toplam 500'u gecerse
		// "Bu kadar sayi yeter, ... adet sayi girdiniz, toplami ..."yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		int sum=0;
		int counter=0;
		
		
		while (!(counter>10 || sum>500 )) {
			System.out.println("Lutfen bir sayi giriniz :");
			num=scan.nextInt();
		    sum+=num;
		    counter++;
		}
		
		System.out.println("Bu kadar sayi yeter," + counter +  " adet sayi girdiniz, toplami " +sum);
		
		
		scan.close();
	}

}
