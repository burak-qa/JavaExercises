package day29_staticBlock_passByValue;

public class C03_PsByValue {

	public static void main(String[] args) {
		//Main method'dan diger method'lara veya diger method'lardan main method'a bir
		//variable gonderirseniz Java orjinal variable'lari degil onlarin degerlerini(value) goturur
		//orjinal variable'in degeri degismez
		
				int fiyat=100;
				
				System.out.println(indirimYap25(fiyat)); //75
				System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);//100
				
				//indirimi kalici yaomak istiyorsak main method'a atama yapmaniz gerekir
				fiyat= indirimYap10(fiyat);// method a 100 gonderdim 90 dondurdu. 90 i fiyata atadigim zaman kalici 
				//olarak dondurdu
				System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);//90 kalici olarak degisti
			}

			private static int indirimYap25(int fiyat) {
				fiyat*=0.75;
				return fiyat;
			}

			private static int indirimYap10(int fiyat) {
				fiyat*=0.90;
				return fiyat;
				
			}
	}

