package day04;

public class C05_Homework {
    public static void main(String[] args) {
        //1- matematiksel operatorler: kodlarimizi yazarken dogru sekilde yazmazsak yanlis sonuclara ulasabiliriz.
		
		System.out.println("Java"+20+30); //Java2030
		System.out.println("java"+ (30+20)); //java50
		System.out.println(20+30+"java"); //50java
		System.out.println(""+20+30+"java");//2030java
       // ilem sirasi us parantez
		//carpma ve bolme
		//toplama ve cikarma
		//esit oncelikli islemlerde oncelik soldaki islem
		
		//2-Modulus: bir bolme islemindeki kalan degeri bize verir
		
		int num = 25;
		
		System.out.println(num%2); //1
		System.out.println(num%10);//5
		//num/10(sayi tam sayi olmak uzere): birler basamagini yok edip kalan kismi bize verir
		System.out.println(num%10);//5
		System.out.println(num/10);//2
    }
}
