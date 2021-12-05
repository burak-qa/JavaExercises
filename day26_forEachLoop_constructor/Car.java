package day26_forEachLoop_constructor;

public class Car {


	//java biz bir class olusturdugumuzda, o class'dan obje uretecegimizi bilir
	//ve her class'a default bir constructor yerlestirir
	//java'nin claas'a koydugu bu default constructor gorulmez
	//ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	
	//bir constructor olusturmak cok kolaydir
	//method'a benzer ama method'dan farklidir
	//1-Constructor ismi class ismi ile ayni olmalidir
	//class isimleri buyuk harfle basladigi icicn Constructor ismi de buyuk harfle baslar
	//(method'dan 1. farki budur, method'ar kucuk hafrle baslar)
	//2-Constructor'larin return type'i olmaz
	//(method'dan 2. farki budur, method'larin mutlaka return type'i olmalidir)
	
	 public int year=2000;
	String colour;
	String model;
	int km;
	boolean saleIt;
	
}
	

