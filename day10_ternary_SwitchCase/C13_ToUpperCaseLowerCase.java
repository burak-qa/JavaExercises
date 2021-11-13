package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {
    public static void main(String[] args) {
        // verilen Stringin tamamini buyuk veya kucuk harfe cevirir
		
		String name="buRak"; //Bunu Burak olarak yazdiralim
		System.out.println(""+name.toUpperCase().charAt(0)+
							name.toLowerCase().charAt(1)+
							name.toLowerCase().charAt(2)+
							name.toLowerCase().charAt(3)+
							name.toLowerCase().charAt(4));
		
		//Turkce lokal harflerkullanarak tamamini kucuk harfe cevirelim
		
		System.out.println(name.toLowerCase(Locale.forLanguageTag("tr")));
    }
}
