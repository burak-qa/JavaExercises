package day05_Exercises;

public class Q_01 {
    public static void main(String[] args) {
        // verilen 12345 sayisinin rakamlarini yukatidan asagiya dogru yazdirin
		//ex: input:
		//output: 1
		//        2
		//        3
		//        4
		//        5

        int num =12345;
        int birler= num%10;     //5 birler basamagi sayinin 10 a bolumunden kalanidir. 
        int onlar= (num/10)%10; //once 5 ten kurtulmamiz lazim busebeble num/10 yaptik sonra 4 u bulmak icin %10 yaptik
        int yuzler= (num/100)%10;
        int binler= (num/1000)%10;
        int onBinler= (num/10000);

        System.out.println(onBinler);
        System.out.println(binler);
        System.out.println(yuzler);
        System.out.println(onlar);
        System.out.println(birler);

        //consolda alt satira yazdirmak icin "\n" komutu kullanilir
		System.out.println(onBinler+ "\n"+ binler + "\n"+ yuzler+ "\n"+ onlar+ "\n"+ birler);

    }
    
}
