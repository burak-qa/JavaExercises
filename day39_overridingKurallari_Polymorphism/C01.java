package day39_overridingKurallari_Polymorphism;

public class C01 {

	public static void main(String[] args) {
		
		

	}
	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
	}
	
	private void privateMethod() {
		System.out.println("Parent class private method"); 
	}
	//final demek bu son hali bir daha degistirilemez demektir 
	//dolayisiyla final olarak tanimlanan bir method 
	//overrijde edilemez 
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	
	//child classmile parent class ayni package'
	//method'larin acsess modifier'lari public, 
}
