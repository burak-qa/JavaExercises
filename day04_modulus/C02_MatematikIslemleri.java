package day04_modulus;

public class C02_MatematikIslemleri {
    public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		String str1="Burak";
		String str2="Dila";
		
		System.out.println(num1+num2+str1); //30Burak
		
		System.out.println(str1+num1+num2); //Burak1020
		
		System.out.println(str2+(num1+num2)); //Dila30
		
		System.out.println(num1*num2+str1);  //200Burak
		
		System.out.println(str1+num1*num2); //Burak200

	}
}
