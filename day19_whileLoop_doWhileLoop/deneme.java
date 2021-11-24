package day19_whileLoop_doWhileLoop;
import javax.swing.JOptionPane;
public class deneme {

	    public static void main(String[] args) {

	        String Isimler[][]=new String[3][2];

	        for(int i=0; i<Isimler.length; i++){
	            Isimler[i][0]=JOptionPane.showInputDialog((i+1)+". Kisinin ismi giriniz");
	            Isimler[i][1]=JOptionPane.showInputDialog(Isimler[i][0]+" Notunu giriniz");
	        }


	        int EnBuyukNot=0;
	        int EnBuyukNotIndeks=0;
	        int i=0;
	        do {

	            if(Integer.valueOf(Isimler[i][1])>EnBuyukNot){
	                EnBuyukNot=Integer.valueOf(Isimler[i][1]);
	                EnBuyukNotIndeks=i;
	            }

	            i++;
	        }while(i<Isimler.length);


	        JOptionPane.showMessageDialog(null, "En yuksek not " + Isimler[EnBuyukNotIndeks][1] + " notu alan " + Isimler[EnBuyukNotIndeks][0]);

	    }

	}

