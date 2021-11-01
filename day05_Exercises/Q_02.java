package day05_Exercises;

public class Q_02 {
    public static void main(String[] args) {
        /*
            \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
            \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
            \\: prints a back slash :\ (ters slash) yazdırır
            \': prints single quote :' tek tırnak yazdırır.
            \": prints double quote :"" Çift tırnak yazdırır.
        */

        //  Soru-1 :   konsola      "Hello ", "World  \ /"   seklinde yazdırınız

        System.out.println("\"Hello\", \"World \\ /\"");

        //soru-2: Pazartesi kelimesinin her harfini ayri bir satira gelecek sekilde yazdirin.

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

        //soru-3 : "Java"ile hayat cok 'afilli' yazdirin.

        System.out.println("\"Java\" ile hayat cok \'afilli\'");

        //Soru-4 : "Basari" gayrete
		// 'asiktir'  yazdırınız sonraki "TechProEd ile java cok kolay ..." ifadesi 
		//3 satır sonra ve satır basından 1 tab ileri de yazılsın.

        System.out.println("\"Basari\" gayrete \n \'asiktir\' \n\n\n \t \"TechProEd ile java cok kolay...\"");


    }
}
