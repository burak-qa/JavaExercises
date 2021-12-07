package day28_constructorCall_staticKeyword;

public class C02 {
	
	int x=5;
	static int y=10;
	

	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		
		
		C02 obje1=new C02();
		
		System.out.println("obje1 icin x : "+ obje1.x +", obje1 icin y : " + y);
		 obje1.x++;// x i arttirmamizi kabul etmedi bizde obje1 uzerinden ulastik
		 y++;// y  static oldugu icin ulasilabiliyoruz 
		 System.out.println("islemden sonra obje1 icin x : "+ obje1.x +", obje1 icin y : " + y);
	
		 
		 //ayni class icinde iken static variable'lara ulasmak icin obje'ye ihtiyac yoktur
		 //kullanirsak Java CTE vermez fakat "static variable lardan ulas der"
		 C02 obje2=new C02();
		 System.out.println("obje2 icin x : "+ obje2.x +", obje2 icin y : " +y);
		 
		 obje2.x++;
		 y++;
		 System.out.println("islemden sonra obje2 icin x : "+ obje2.x +", obje2 icin y : " + y);
		 System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in " + "x : "+obje1.x+ "y : "+y);
		 
		 C02 obje3=new C02();
		 
		 
		 obje3.x=20;
		 y=40;
		 
		 System.out.println("obje3'den sonra obje1'in x: "+ obje1.x);
		 System.out.println("obje3'den sonra obje2'in x: "+ obje2.x);
		 System.out.println("obje3'den sonra obje3'in x: "+ obje3.x);
		 
		 System.out.println("obje3'den sonra obje1'in y: "+ y);
		 System.out.println("obje3'den sonra obje2'in y: "+ y);
		 System.out.println("obje3'den sonra obje3'in y: "+ y);
		 
		 
		 
		 
	}
	

}
