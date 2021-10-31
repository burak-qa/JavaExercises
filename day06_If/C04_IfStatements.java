package day06_If;

public class C04_IfStatements {
    public static void main(String[] args) {
        //basit if cumleleri bagimsiz calisir 
		//her bir if cumlesi kendi sartina bakar, sart true ise body calisir,
		//sart false ise body calismaz
	
		int a=10;
		int b=20;
		
		if (a>5) {
			System.out.println("a sayisi besten buyuk"); //burada sadece bu code yazdirir
		}
		if (a>b) {
			System.out.println("a sayisi b den buyuk");
		}
	
		if (b>100) {
			System.out.println("b sayisi 100'den buyuk");
		}
    }
}
