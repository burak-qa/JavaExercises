package calisma;

import java.util.Scanner;

public class C03_worldTime {

	public static void main(String[] args) {

		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Ders saatlerini ogrenmek icin lutfen\nDerse katildiginiz ulkenin karsisindaki numarayi giriniz\nUSA\t\t1\nAlmanya\t\t2\nYunanistan\t3\nTurkiye\t\t4");
		        
		        byte ulke = scan.nextByte();
		        
		        switch (ulke) {
		        
		        case 1:
		            System.out.println("Amerika icin ders saatleri:\nPazartesi-Persembe\t\t 13.30-16:20\nCumartesi\t\t\t 10:00-16:20\nPazar\t\t\t\t 13:30-16:20");
		            System.out.println("Ayrintili bilgiye asagidaki linkten ulasabilirsiniz:\nhttps://docs.google.com/spreadsheets/d/1e3vK3xmX09yQMVxVT1TJC0BZc5Xc4Q9zkCEjDr4rtc0/edit#gid=0");
		            break;
		            
		        case 2:
		            System.out.println("Almanya icin ders saatleri:\nPazartesi-Persembe\t\t 19.30-22:20\nCumartesi\t\t\t 16:00-22:20\nPazar\t\t\t\t 19:30-22:20");
		            System.out.println("Ayrintili bilgiye asagidaki linkten ulasabilirsiniz:\nhttps://docs.google.com/spreadsheets/d/1e3vK3xmX09yQMVxVT1TJC0BZc5Xc4Q9zkCEjDr4rtc0/edit#gid=0");
		            break;
		            
		        case 3:
		            System.out.println("Yunanistan icin ders saatleri:\nPazartesi-Persembe\t\t 20.30-23:20\nCumartesi\t\t\t 17:00-23:20\nPazar\t\t\t\t 20:30-23:20");
		            System.out.println("Ayrintili bilgiye asagidaki linkten ulasabilirsiniz:\nhttps://docs.google.com/spreadsheets/d/1e3vK3xmX09yQMVxVT1TJC0BZc5Xc4Q9zkCEjDr4rtc0/edit#gid=0");
		            break;
		            
		        case 4:
		            System.out.println("Turkiye icin ders saatleri:\nPazartesi-Persembe\t\t 21.30-00:20\nCumartesi\t\t\t 18:00-00:20\nPazar\t\t\t\t 21:30-00:20");
		            System.out.println("Ayrintili bilgiye asagidaki linkten ulasabilirsiniz:\nhttps://docs.google.com/spreadsheets/d/1e3vK3xmX09yQMVxVT1TJC0BZc5Xc4Q9zkCEjDr4rtc0/edit#gid=0");
		            break;
		        default:
		            System.out.println("1-2-3 veya 4 rakamlarindan birini giriniz.");
		            System.out.println("Ayrintili bilgiye asagidaki linkten ulasabilirsiniz:\nhttps://docs.google.com/spreadsheets/d/1e3vK3xmX09yQMVxVT1TJC0BZc5Xc4Q9zkCEjDr4rtc0/edit#gid=0");
		            break;
		        }
		        
		        
		        scan.close();
		    }

	}

