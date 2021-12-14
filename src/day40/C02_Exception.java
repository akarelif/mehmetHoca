package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		
		// Kullanicidan istedigi kadar sayi alip
		// Bu sayilari toplayan bir program yapiniz
		// Sayi girisini bitirmek icin q'ya basiniz
		
		int sayi=0;
		int toplam=0;
		int count=0;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	 
		
		
		try {
			while(count<10000) {
				
				System.out.println("Lutfen Toplamak Ýcin Bir Sayi Yaziniz \nBitirmek Ýcin Sayi Disinda Bir Tusa Basiniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;
				
			}
			
		} catch (InputMismatchException e) {
			
			System.out.println("girrdiginiz " + count + " adet sayinin toplami : " + toplam);
			
		}
		
		
		
		

		
		

	}

}
