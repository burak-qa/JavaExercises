package day03;

public class C04_PreIncrementPostIncrement {
    public static void main(String[] args) {
		//preIncrement ve postIncrement sadece number++ veya number-- yazimi icin gecerlidir
		int number=10;
		
		number++;
		number++;
		number++;
		
		System.out.println(number); //13
		
		
		System.out.println(number++); //13 bu satirda iki islem var
		                              // bir artirma, bir de yazdirma
		System.out.println(number); //14 cunku 16.satirda once yazdirdik sonra arttirdik
		
		//once arttirmak sonra yazdirmak isteseniz ++number
		//once yazdirmak snra artirmak isterseniz number++
		
		System.out.println(++number); //15
        
	}
}
