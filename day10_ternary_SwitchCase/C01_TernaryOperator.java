package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {
        // kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz..");
		int a=scan.nextInt();
		
		System.out.println("Lutfen bir sayi daha giriniz..");
		int b=scan.nextInt();
		
		System.out.println(a<b ? "buyuk olmayan sayi " + a + " dir" : "buyuk olmayan sayi " + b + "dir");
		
		scan.close();
        
    }
}
