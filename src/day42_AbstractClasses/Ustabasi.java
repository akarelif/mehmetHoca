package day42_AbstractClasses;

public class Ustabasi extends Ýsci{
	
	 public void statu() {
	// System.out.println("Bu Class'daki Tum Personel Ustabasidir.imza:Ustabasi");
	}

    public void maas() {
	// System.out.println("Ustabaslari Aylik 10000 TL Maas Alir.imza:Ustabasi");
    }

    public void mesai() {
	// System.out.println("Ustabasi Ariza Durumunda Ariza Cozulunceye Kadar Calisir.imza:Ustabasi");
    }
    // Obje olusturdugumuz en alttaki class parent class'lardaki method'lari
    // Override edince, class'dan olusturulan objeler en dogru ve spesifik ozelliklere kavustu
    
    // Ama klasik parent-child iliskisinde tum method'lari override etme mecburiyeti YOKTUR
    // Java parent class'lardaki tum method'lari override etmek MECBURÝYETÝ kazandirmak icin
    // Abstract class yapisini olusturmustur
    // Yani bir class'ý abstract olarak tanimlarsaniz child class'lar tum method'lari override
    // Etmek zorunda kalir.
    
    // Dolayisiyla abstract yaptigimiz parent class'lar sadece kalip gorevi yapacaklar
    
    public static void main(String[]args) {
	
	Ustabasi ust1 = new Ustabasi();
	
	ust1.statu();
	ust1.maas();
	ust1.mesai();
	
}
	

}
