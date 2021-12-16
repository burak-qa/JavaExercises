package day37_Intheritance;

public class Corolla extends Toyota {
	String renk;
	int fiyat;
	boolean elektirikliMi;
	int tekerSayisi=4;
	String uretimYeri= "Turkiye";
	
	
	 public static void main(String[] args) {
		
		 Corolla                  car1         =             new           Corolla();
	//Class ismi && Data turu 	 obje ismi   assignment    keyword      Constructor 
		 
		 
		 //Java da obje olusturdugumuz her class ismi ayni zamanda bir data turu'dur
		 //Bu ornek icin Corolla hem class adi, hem de olusturdugumuz car1 objesinin data type'idir.
		 //Java da obje uretilen herbir class ayni zaman da non-primitive data turu olur 
		 
		 System.out.println(car1.calisiyorMu);
		 System.out.println(car1.tekerSayisi);
		 System.out.println(car1.uretimYeri);
		 
		 Toyota car2=new Corolla();
		 
		 
		 
		 System.out.println(car2.calisiyorMu);
		 System.out.println(car2.tekerSayisi);
		
		 
		 Araba car3=new Corolla();
		 
		 System.out.println(car3.calisiyorMu);
	   
		 
	}
}
