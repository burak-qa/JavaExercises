package day13_stringManipulations;

public class C04_ReplaceAll {
    public static void main(String[] args) {
        String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlari kullanarak Java ogrenmek cok kolay 
		
		str=str.replaceAll("\\d", ""); // tum digitleri hiclik ile degistirdim
			
		str=str.replaceAll("\\s", "x");
		
		str=str.replaceAll("\\W", ""); //Buyuk W word olmayanlari degistir, kucuk w harfleri yok eder. 
		
		str=str.replace("x", " ");
		System.out.println(str); //Java ogrenmek cok kolay
    }
}
