package day11_stringManipulations;

public class C01_Equals {
    public static void main(String[] args) {
        int a= 10;
		int b=a+0;
		
		System.out.println(a==b); //true
		
		char ch1='K';			// burada aski degerini kullanir
		char ch2='K'+ 0;
		
		System.out.println(ch1==ch2); //true
		
		String str1="Ali";
		String str2="Veli";
		String str3="Ali Veli";
		String str4=str1 + " " + str2;
		
		System.out.println(str4); // Ali Veli
		System.out.println(str3==str4); //false   degerler esit fakat referanslar esit degil 
		System.out.println(str3.equals(str4)); //true  burada equals methodu referanslara bakmaz degerlere bakar
    }
}
