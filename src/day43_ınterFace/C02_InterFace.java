package day43_ýnterFace;

public interface C02_InterFace {
	
	void motor(); // Normal class'larda access modifier yazmazsaniz java default access modifier kabul eder
	              // Ýnterface'de ise access modifieryazmazsaniz java public olarak kabul eder
	
	 int sayi=10; // Final ve static olarak kabul etti
	
	 
	 // Ýnterface'de body'si olan bir method yazmak isterseniz 
	 // Java size iki alternatif sunar
	 // 1- Method'un basina ""default" keywor yazabilirsiniz
	 // Ancak burda yazilan default access modifier degil,Java'nin interface icin ozel kabul ettigi bir keyword'dur
	 
	 
	 
	public  default void kaporta() {
		 
		 System.out.println("Default Keyword Sayesinde Body Olusturabildim");
		 
	 }
	
	public static void sansuman() {
		
		System.out.println("Static Keyword ile Body Olusturabildim");
		
	}
}
 