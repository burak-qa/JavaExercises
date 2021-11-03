package day09_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        //9- Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
		//kural 1: 4 ile bolunemeyen yiller artik yil degildir
		//kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		//kural 3: 4 un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz..");
		int year=scan.nextInt();
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println("artik yildir");
				} else {
					System.out.println("artik yil degil");
				}
			} else {
				System.out.println("artik yildir");
			}
		} else {
			System.out.println("artik yil degildir");
		}
		
		
		scan.close();
    }
}
