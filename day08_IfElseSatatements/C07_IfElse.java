package day08_IfElseSatatements;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {
        //2- Kullanicidan iki sayi isteyin, sayilarin ikisi de positif ise sayilarin toplamini yazdirin
		//sayilarin ikisi de negatif ise sayilarin carpimini yazdirin,
		//sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
		//sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Lutfen bir sayi giriniz : \n Sonra bir sayi daha girerek Enter'a basiniz ");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		
		if (a>0 && b>0) {
			System.out.println("sayilarin toplami : " + (a+b));
		} else if(a<0 && b<0){
			System.out.println("sayilarin carpimi : "+ a*b);
		} else if(a>0 && b<0 || b>0 && a<0) {                    // burada a*b<0 diye yazarsak da ayni sonucu buluruz
			System.out.println("farkli isaretlerde sayilar ile islem yapamazsin!");
		} else {
			System.out.println("Sifir carpmaya gore yutan elemandir");
		}
		scan.close();
    }
    
}
