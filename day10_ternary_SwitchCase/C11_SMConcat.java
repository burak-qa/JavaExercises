package day10_ternary_SwitchCase;

public class C11_SMConcat {
    public static void main(String[] args) {
        // String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa 
		//JAVA bunlari yan yana ekler. Buna Concatenation denir.
		
		String name="Ali";
		String surName="Can";
		
		System.out.println(name+ " " +surName);
		
		//ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(name.concat(surName));
		System.out.println((name.concat(" ").concat(surName))); //string metotlarini .(nokta) koyarak arka arkaya istedigimiz kadar yazdirabiliriz.
		
    }
}
