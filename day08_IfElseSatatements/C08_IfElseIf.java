package day08_IfElseSatatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        //7- Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin. 
		// 50'den kucukse "D", 50-60 arasi "C", 60-80 arasi "B", 80'nin uzerinde ise "A"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz :");
		double not=scan.nextDouble();
		if(not<0 || not>100) {
			System.out.println("Lutfen gecerli bir not yaziniz");
		} else if (not <50) {
			System.out.println("Aldiginiz not : "+ "D");
		} else if( not<60){
			System.out.println("Aldiginiz not : " +"C"); //onceki siklari oldure oldure gidiyoruz
		} else if( not<80) {
			System.out.println("Aldiginiz not : " + "B");
		} else {
			System.out.println("Aldiginiz not : " + "A");
		}
		
		
		
		
		
		scan.close();
    }
    
}
