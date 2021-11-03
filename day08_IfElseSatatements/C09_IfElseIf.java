package day08_IfElseSatatements;

import java.util.Scanner;

public class C09_IfElseIf {
    public static void main(String[] args) {
        //8- Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
		//		Teklif 80.000'in uzerinde ise "Kabul ediyorum",
		//  	60-80.000 arasinda ise "Konusabiliriz",
		//		60.000'in altinda ise "Maalesef kabul edemem" yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen maas teklifinizi yaziniz");
		
		double maas= scan.nextDouble();
		
		if (maas>=80000) {
			System.out.println("Kabul ediyorum");
		} else if(maas>=60000){
			System.out.println("Konusabiliriz");
		} else {
			System.out.println("Maalesef kabul edemem ");
		}
		
		
		
		
		scan.close();
    }
    
}
