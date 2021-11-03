package day09_nestedIfElseStatements;

public class C06_TernaryOperator {
    public static void main(String[] args) {
        int y=1;
        int z=1;
        
        int a= y<10 ? y++ : z++; //burada ++ y den sonra oldugu icin once atama yapiyoruz sonra y nin degerini arttiriyoruz
        
		System.out.println(y+","+z+","+a); //2,1,1
    }
}
