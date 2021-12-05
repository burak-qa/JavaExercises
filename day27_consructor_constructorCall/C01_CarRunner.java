package day27_consructor_constructorCall;

import day26_forEachLoop_constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		// Dunku Car class'indan bir obje olusturmak istedigimizde
		//java Car class'ini icinde bulundugumuz class'a import etmek ister
		
		
		Car car=new Car();
		System.out.println(car.year); //2000
		//ancak baska package'da oldugu icin icinde bulundugumuz class'dan
		//car class'indaki variable'lara ulasabilmem icin variable'in axcess modifiler'i 
		//public olmalidir
		
		
		Car1 car1=new Car1();
		System.out.println(car1.km + " "+car1.model +" "+ car1.colour+" "+ car1.year+ " "+ car1.saleIt);//0 null null 2000 false
		
		
		car1.km=75000;
		car1.model="Corolla";
		car1.colour= " Kirmizi";
		System.out.println(car1.km + " "+car1.model +" "+ car1.colour+" "+ car1.year+ " "+ car1.saleIt); //75000 Corolla  Kirmizi 2000 false
		
		
		Car1 car2=new Car1();
		System.out.println(car2.km + " "+car2.model +" "+ car2.colour+" "+ car2.year+ " "+ car2.saleIt);//0 null null 2000 false
		
		Car1 car3=new Car1();
		car3.km=40000;
		car3.saleIt=true;
		System.out.println(car3.km + " "+car3.model +" "+ car3.colour+" "+ car3.year+ " "+ car3.saleIt); //40000 null null 2000 true
		
		
		
		
		
		
		
	}

}
