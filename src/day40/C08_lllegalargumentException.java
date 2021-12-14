package day40;

import java.util.Scanner;

public class C08_lllegalargumentException {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Konsolda Görmek Ýcin Yasinizi Giriniz");
		
		int yas = scan.nextInt();
		
		try {
			if(yas<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(yas);
			}
			
		}catch(IllegalArgumentException e) {
			
			System.out.println(e);
			System.out.println("Yas Sifirdan Kucuk Olamaz");
		}
	}

}
