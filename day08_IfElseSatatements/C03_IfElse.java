package day08_IfElseSatatements;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //2- kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
		//aski tablosuna bakmamiz gerekecek!
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir karakter giriniz :");
		
		char a=scan.next().charAt(0);
		
		if ((a>='A' && a<='Z')||( a>='a' && a<='z')) {
			System.out.println("girdiginiz  :" + a + " bir harftir");
		} else {
			System.out.println("girdiginiz :"+ a + " bir harf degildir");
		}
		
		scan.close();
    }
}
