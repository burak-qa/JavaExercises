package day26_forEachLoop_constructor;

public class JeepRunner {

	
	public static void main(String[] args) {
		// Jeep class'indan bir obje olusturalim ve ozelliklerini yazdiralim
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka+
				" "+ jeep1.model+ " "+ jeep1.year); //10000 1001 Toyota colorolla 2001

			
			//jeep class'indaki variable'lar instance variable'lar olduklarindan
			// atadigim degerler sadece benim objem icicn degerleri degistirir
			// jeep class'indaki degerlere hic bir sey yapmaz
			jeep1.fiyat=150000;
			jeep1.ilanNo=1002;
			jeep1.marka="Mercedes";
			jeep1.model="Class";
			jeep1.year=2005;
			System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka+
					" "+ jeep1.model+ " "+ jeep1.year);  //150000 1002 Mercedes Class 2005
			
			jeep1.speed(150);// Araba saatte 150km yapar
			jeep1.yakit("benzin");//Araba yakit olarak benzin kullanir
			
	}

}
