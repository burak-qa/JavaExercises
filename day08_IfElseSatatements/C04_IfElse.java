package day08_IfElseSatatements;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {
        //3-Kullaniciya yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, clismalisin"
		//  65'den buyukse "emekli olabilirsin"yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen yasinizi giriniz :");
		
		int age=scan.nextInt();
		
		if (age<65) {
			System.out.println("emekli olamazsin, calismalisin");
		} else {
			System.out.println("emekli olabilirsin");
		}
		scan.close();
    }
    
}
