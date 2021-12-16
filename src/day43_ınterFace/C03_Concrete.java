package day43_ýnterFace;

public  class C03_Concrete implements C02_InterFace{

	public static void main(String[] args) {
		
		C03_Concrete concreteObje = new C03_Concrete();
		
		// Interface'de default keyword kullanarak olusturdugumuz body'si olan method'lara 
		// Child concrete class'lardan obje vasitasiyla ulasabilirim
		
		concreteObje.kaporta();
		
		
		// Interface'de default keyword kullanarak olusturdugumuz body'si olan method'lara 
		// Child concrete class'lardan interface ismi vasitasiyla ulasabilirim
		
		C02_InterFace.sansuman();

	}
	
    // Bir interface 'de static veya default keyword kullanarak body'si olan bir method olusturursak
	// Bir interface'e implements eden concrte child class'lar bu method'lari
	// Implement etmek ZORUNDA DEGÝLDÝR
	
	@Override
	public void motor() {
		
	}

}
