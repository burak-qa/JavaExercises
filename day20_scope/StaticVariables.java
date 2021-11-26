package day20_scope;

public class StaticVariables {
	static int not=70;
	static int num;
	static String adress="Antalya";
	static String straat;
	static boolean active=true;
	static boolean inHoliday;
	
	
	public static void main(String[] args) {
		System.out.println(not);//70
		not++;
		System.out.println(not);//71
		staticMethod();
		System.out.println(not);//22 burada yeni atadigimiz sayiyi yazdirir
		
		
		StaticVariables obje=new StaticVariables();
		obje.staticOlmayanMethod();
		System.out.println(not);
		
		
		
	}

	public static void staticMethod() {
		//static variable'lara main method'dan ulasilabilir mi? EVET
		not++;
		System.out.println("static method'da sayi : " + not);
	}
	public void staticOlmayanMethod() {
		//static variable'lra main method'dan direc ulasilabilir mi? EVET
		//static variable'lara static olan veya olmayan tum method'lardan ulasilabilir
		//bu yuzden static variable'lara CLASS VARIABLE denir
		not++;
		System.out.println("static olmayan sayi : " + not);
		
		
		
		
	}
	
}
