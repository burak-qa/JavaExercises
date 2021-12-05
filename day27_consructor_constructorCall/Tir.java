package day27_consructor_constructorCall;

public class Tir {
	
	
	int year=2000;
	String colour;
	String model;
	int km;
	boolean saleIt;
	
	
	public Tir(int i, String string, String string2, int j, boolean b) {
			//int km, String model, String colour, int year, boolean saleIt
		//Tir Runner classindan yolladigimiz degerlerin instance variable'lar ile eslesmesi icin
		//atamalari yapmam lazim
		
			km=i;
			model=string;
			colour=string2;
			year=j;
			saleIt=b;
		
	}


	public Tir(int km, String model, String colour) {
		// i, string ve string2 isim olarak guzel isimler degil
		//kod'umuzu sonradan incelerken anlasilir degil
		//daha anlasilir olamasi icin variable isimlerini anlamli yapalim
		//int km, String model ,String colour
		
		this.km=km;
		this.model=model;
		this.colour=colour;
		
		//basina this. yazdigimizda java bu variable'in class level'daki oldugunu anlar
		
	}

	

}
