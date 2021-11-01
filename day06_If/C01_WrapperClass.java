package day06_If;

public class C01_WrapperClass {
    public static void main(String[] args) {
        int num1=10; //primitive
		Integer num2=20;  //nonprimitive
		//num1. yazdigimizda hic bir method cikmaz, cunku num1 int dir. yani primitive dir.
		//num2. yazdigimizda ise bir cok metod gerilyor. Cunku num2 Integer dir yani wrapper class dir.
		
		String tel1= "3578987";
		String tel2="3245434";
		
		System.out.println(tel1+ tel2); // 35789873245434
		
		//bu sayilari toplamak istersek

		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));// 6824421
		
		System.out.println(Integer.MIN_VALUE);// -2147483648 int min degeri
		System.out.println(Integer.MAX_VALUE);//  2147483647  int max degeri
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308  buradaki E 308 tane sifir var demek. 
		System.out.println(Short.MAX_VALUE); //32767 double in max. degeri. 
		
		//String caddeNo= "B203";
		String caddeNo= "203";
		String sokakNo= "1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		//Integer.valueOf(String numerik ifade) metodu'u string olarak kaydedilmis 
		//numerik ifadeleri sayiya cevirir ancak String ifadede numerik olamayan bir karakter olursa 
		//Java  NumberFormatException hatasi verir ve calismayi durdurur
		//stops execution
		
		System.out.println("Hello world");
    }
}
