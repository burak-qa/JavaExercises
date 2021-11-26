package day20_scope;

public class InstanceVar2 {
	
	
	
	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;
	
	
	

	public static void main(String[] args) {
		//instance variable'lara main method'dan direk ulasilabilir mi? HAYIR
		//nasil ulasilabilir? OBJE OLUSTURARAK
		
		InstanceVar2 veli=new InstanceVar2();
		System.out.println(veli.adres); //Ankara
		System.out.println(veli.dogumYeri); //nul
		System.out.println(veli.notOrtalamasi); //0.0
		System.out.println(veli.yasOrt); //12.3
		System.out.println(veli.cinsiyet); //E
		System.out.println(veli.karakter); // space(bosluk)
		System.out.println(veli.ogrenciMi); //true
		System.out.println(veli.izinliMi); //false

	}
	public static void staticMethad() {
		//instance variable'lara static method'dan direk ulasilabilir mi? HAYIR
		//nasil ulasilabilir? OBJE OLUSTURARAK
		
		
	}
	public void staticOlmayanMethod() {
		  // instance variable'lara static olmayan method'dan direk ulasilabilir mi ? EVET
	}
}
