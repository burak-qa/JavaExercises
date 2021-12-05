package day27_consructor_constructorCall;

public class Car1 {

	int year=2000;
	String colour;
	String model;
	int km;
	boolean saleIt;
	
	
	public Car1(int km, String model, String colour, int year, boolean saleIt) {
		// atama yapacagimiz tum ozellileri parametre olarak yolladik
		
	}
	
	//ben 5 ozeligi birden degistiren bir constructor urettigimde
	//java default constructor'i siler
	//bu durumda daha onceden yazilan ve default constructor'i kullanana tum kodlar coker
	//bu durumda kodlari duzeltmek icicn javanin sildigi default constructor yerine 
	//parametresiz bir constructor olusturmaliyim
	
	
	
	
	public Car1() {
		
	}
	//parametresiz constructor uretmenin syntax'i clasAdi + () + {}
	public Car1(int i) { //bu satirdaki int km ile class level'daki int km farkli scope'lardadir
		km=i;
	}
	public Car1(int i, int j) {
		year=i;
		km=j;
	}

	public Car1(String i) {
		model=i;
		
	}

	public void speed(int speed) {
		System.out.println("Araba saatte " + speed + "km yapar");
	}
	
	public void yakit (String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

}
