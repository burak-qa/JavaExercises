package day09_nestedIfElseStatements;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        
        int x=5;
		
		String sonuc = x%2==0 ? "cift sayi" : "tek sayi";
		System.out.println(sonuc);
		
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi" );
		//ternry iki turlu kullanabiliyoruz
		//ya donen bir sonuca gore bir variable olusturup assign ederiz
		//veya direk syso icine yazip sonucu yazdiririz
		
		
		
		//eger ternary de donecek sonuclar ayni data turunden degilse
		//atama yapamayiz, sadece syso ile yazdirabiliriz
		System.out.println(x>5 ? "Aferin" : 4); //Aferin
		
		// String resul = x>5 ? "Aferin": 4; 
    }
    
}
