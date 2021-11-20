package day15_methodCreation;

public class C03_MedhodOverloading {

	public static void main(String[] args) {
	 //Java da ayni isimde birden fazla method olur mu?
		//cevap: EVET
		
		//Ayni isimde birden fazla method olursa Java hangisini calistiracagina nasil karar verir?
		//cevap: isim ayni olan methodlarda oncelikle parametre sayisina bakar
		//sonra da parametre sayisi ile arguman sayisi esit olanlardan 
		//arguman data turleri ile parametre data turleri arasinda uyuma bakar
		//tamamen uyusan vrsa onu kullanir
		//tamamen uyusan yoksa kapsayan var mi bakar ve onu kullanir
		//birden fazla secenek varsa java 
		/*int num1=4;
		int num2=5;
		int num3=10;
		int num4=20;*/
			
		topla(2,4);
		
	 
	 

	}

	public static void topla(int num1, int num2, int num3, int num4) {
		System.out.println("dort sayinin toplami : " + (num1+ num2 + num3 + num4));
		
	}

	public static void topla(int num1, int num2, int num3) {
		System.out.println("uc sayinin toplami : " + (num1+num2+num3));
		
	}

	public static void topla(int num1, double num2) {
		System.out.println("iki sayinin toplami id: " + (num1 + num2));
		
	}
	public static void topla(int num1, int num2) {
			System.out.println("iki sayinin toplami ii: " + (num1 + num2));
		
	}
	public static void topla(double num1, int num2) {
		System.out.println("iki sayinin toplami di: " + (num1 + num2));
		
	}
	public static void topla(double num1, double num2) {
		System.out.println("iki sayinin toplami dd: " + (num1 + num2));
		
	}

}
