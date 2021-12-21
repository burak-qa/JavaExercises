package day39_overridingKurallari_Polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		
		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01 obj2 = new C02();
		//obj2.privateMethod();
		obj2.staticMethod();
		// static method'lar override edilemez
		//dolayisiyla signature ayni olmasina RAGMEN bu 
		
		
		
	}
	
	public static void staticMethod() {
		System.out.println("Child class static method calisti");
	}
	
	private void privateMethod() {
		System.out.println("Child class private method"); 
	}
	
	/*
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	*/
	
	

}
