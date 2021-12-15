package day42_AbstractClasses;

public class AbsUstabasi extends Abs›sci{

	// Concrete bir child class parent'i olan abstract class'lardaki tum abstract method'lari implement etmelidir
	// Ama  parent'i olan abstract class'lardaki concrete methodlar'i implement etmek zorunda degildir
	
	public static void main(String[] args) {
		
		AbsUstabasi ust1 = new AbsUstabasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
	
	}

	@Override
	public void mesai() {
		System.out.println("Ustabasi Ariza Durumunda Ariza Cozulunceye Kadar Calisir.imza:Ustabasi");
		
	}

	@Override
	public void maas() {
		System.out.println("Ustabaslari Aylik 10000 TL Maas Alir.imza:Ustabasi");	
		
	}

	@Override
	public void statu() {
		System.out.println("Bu Class'daki Tum Personel Ustabasidir.imza:Ustabasi");
		
	}

	public void abstractMethod() {
		
		// Personel class'indan geldi
		
	}

	
	
		
	


}
