package day02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
		//kullanicidan veri almak icin 3 adim takip edilir
		//1.adim Scanner objesi olusturmak
		
		Scanner scan=new Scanner(System.in);
		
		//2.adim kullaniciya ne istediginizi soylemek
		
		System.out.println("Lutfen isminizi yaziniz: ");
		
		String name=scan.next();
		
		System.out.println("your name...:"+name);
		
		
		//scan  bir scanner objesidir
		//isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		//scan bir obje oldugu icin data turu non-primitive dir
		//primitive data turleri sadece deger icerirken,
		//non-primitive data turleri degerin yaninda method lar barindirir
		//scan.  dedigimizde kullanabilecegimiz bu metod lari gorebiliriz
		
		
		scan.close();
	}
}
