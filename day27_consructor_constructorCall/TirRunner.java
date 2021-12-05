package day27_consructor_constructorCall;

public class TirRunner {

	public static void main(String[] args) {
		//bir tane tum ozellikleri degistiren constructor olusturalim
		
		Tir tir1=new Tir(4500, "axor", "white", 2021, false);
						//int km, String model, String colour, int year, boolean saleIt
		
		System.out.println(tir1.km+ " "+ tir1.model+ " "+ tir1.colour+ " "+ tir1.year+ " "+ tir1.saleIt);
			//4500 axor white 2020 false
		
		
		//3 ozelligi degistiren bir constructor olusturalim
		//int km, String model, String colour
		
		Tir tir2=new Tir(12000, "kar", "black");
		System.out.println(tir2.km+ " "+ tir2.model+ " "+ tir2.colour+ " "+ tir2.year+ " "+ tir2.saleIt);
		//12000 kar black 2000 false
	}

}
