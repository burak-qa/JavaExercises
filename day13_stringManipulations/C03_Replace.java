package day13_stringManipulations;

public class C03_Replace {
    public static void main(String[] args) {
        String str="Java ogrenmek cok zevkli";
		
		System.out.println(str.replace(" ", "")); //Javaogrenmekcokzevkli
		System.out.println(str.replace("ogrenmek", "kod yazmak")); //Java kod yazmak cok zevkli
		System.out.println(str.replace("Java", "Kod ogrenmek")); //Kod ogrenmek ogrenmek cok zevkli
		System.out.println(str.replace("a", "o")); //Jovo ogrenmek cok zevkli
		System.out.println(str.replace('a', 'x')); //Jxvx ogrenmek cok zevkli
    }
}
