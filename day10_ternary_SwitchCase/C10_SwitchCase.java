package day10_ternary_SwitchCase;

public class C10_SwitchCase {
    public static void main(String[] args) {
        // Verilen sayiyi inceleyin
		// girilen sayi 
		//10 ise "iki basamakli en kucuk sayi"
		//100 ise "uc basamakli en kucuk sayi"
		//1000 ise "dort basamakli en kucuk sayi"
		//diger durumlarda "girdigin sayiyi degistir" yazdirin
        
		int num=18;
		
		switch(num) {
		
		case 10:
			System.out.println("ikibasamakli en kucuk sayi");
			break;
		case 100:
			System.out.println("Uc basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("Dort basamakli en kucuk sayi");
			break;
		default:
			System.out.println("Sayiyi degistirin");
			
		}
    }
}
