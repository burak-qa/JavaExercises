package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz..");
		
		int num=scan.nextInt();
		
		System.out.println(num >0 ? "sayinin mutlak degeri " + (num-0) : "sayinin mutlak degeri " + (0-num));
		
		
		
		
		scan.close();
    }
}
