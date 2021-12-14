package day40;

public class C01_Exception {

	public static void main(String[] args) {
	
		int a=20;
		int b=0;
		
	
		try {
			System.out.println("Sayilarin Bolumu : " + a/b); 
			
		}catch (ArithmeticException e) {
			
			System.out.println("Sifira Bolum Yapilamaz");
		}

		System.out.println("Gorev Tamamlandi");

	}

}

