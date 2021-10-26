package day01_Variables;
public class C02_Variables {
    public static void main(String[] args) {
		
		String school="Star College";
		
		//ayni isim ve degisken turu ile ikinci defa variable olusturulamaz
		//String scholl="Moon College";
		
		
		//farkli data turu de olsa ayni isim ile ikinci defa variable olusturulamaz
		//int school=20;

		
		
		//var olan bir variable'a yeni bir deger atayabiliriz
		school="Moon College";
		
		System.out.println(school);
		
		
		//yazdirma islemine aciklama eklemek
		//mesela school name : 
		System.out.println("School name is: " +school); // Moon College
		System.out.println("School name is: " + "school"); //School name: school
		
	}
}
