package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_TernaryOpertor {
    public static void main(String[] args) {
        //4- Kullanicidan bir sayi alin. Sayi pozitifse "Sayi Pozitif" yazdirin, negatifse sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz..");
		int num=scan.nextInt();
		
		System.out.println(num>0 ? "Sayi Pozitif" : (num*num));
		scan.close();
    }
    
}
