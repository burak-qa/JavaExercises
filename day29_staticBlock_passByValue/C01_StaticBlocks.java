package day29_staticBlock_passByValue;

public class C01_StaticBlocks {

	static {
		System.out.println("static blok main method'dan bile once calisir !!!");
	}
	static {
		System.out.println("eger birden fazla static blok varsa Java yukaridakini daha once calistirir !!!");
	}

	public static void main(String[] args) {
		System.out.println("Java'da once main method calisir");

	}

	static {
		System.out.println("Static method nereye yazarsak yazalim main method dan once yazilir !!!");
	}
}
