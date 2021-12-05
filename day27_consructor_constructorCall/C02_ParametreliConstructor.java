package day27_consructor_constructorCall;

public class C02_ParametreliConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// java'nin olusturdugu default constructor ile obje olusturabiliyoruz
		//ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		//istersek parametreli constructorlar olusturup
		//daha obje olusurken istedigim ozellikleri atayabilrim
		
		Car1 car1=new Car1(50000, "Vectra", "White", 2015, true);
							//int km, String model, String colour, int year, boolean saleIt
		Car1 car2=new Car1(35000);
							//int km,
		
		System.out.println(car2.km); //35000
		Car1 car3=new Car1();
		System.out.println(car3.km);//0
		
		Car1 car4=new Car1(1000);
		System.out.println(car4.km);
		
		//yil ve km yi parametre olarak girebilecegim bir constructor daha olusturabilir miyim? 
		
		Car1 car5=new Car1(2020, 5000);
		System.out.println(car5.year +" "+ car5.km+ " "+ car5.model);
		
		Car1 car6=new Car1("Astra");
		System.out.println(car6.model);
		
	}

}
