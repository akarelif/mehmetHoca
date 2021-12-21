package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		// 1-Bir map olusturmadan once, Map'e koyacagimiz Key ve Value degerlerini secebiliriz
		// Tum degerleri koyabiþlmek icin Key ve Value icin Object. Object secebiliriz
		// Ama bu durumda map icerisindeki elemanlara ait bilgilere ulasmakla zorlanabiliriz
		// Data turu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz
		// Hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit data turu secmeliyiz
		
		// 2-Map'i olustururken map'in turune de karar vermeliyiz
		
		Map<Integer , String> sinif = new HashMap<>();
		
		sinif.put(101, "Ali, Can, J.Dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C#");
		
		int no = 104;
		String isim = "Ayþe";
		String soyisim = "Can";
		String brans = "QA";
		
		sinif.put(no, isim+", "+soyisim +", "+brans);
		
		System.out.println(sinif); // {101=Ali, Can, J.Dev, 102=Veli, Yan, QA,
		                  // map par.  Key1=Value1          Key2=Value2
		                           // 103=Ali, Yan, C#, 104=Ayþe , Can , QA}
		                           //  Key3=Value3      Key4=Value4
		
		// Nosu 102 olan ogrencinin bilgilerini gorelim
		
		System.out.println(sinif.get(102)); // Veli, Yan, QA
		System.out.println(sinif.get(104)); // Ayþe, Can , QA
		
		// Map'deki tum Key'leri gorelim
		
		System.out.println(sinif.keySet()); // [101, 102, 103, 104] Bir set olarak Key degerlerini dondurur
		
		// Map'deki Value'leri gormek istersek
		
		System.out.println(sinif.values()); // Collection olarak [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayþe, Can, QA]
		// Ancak yazdirma islemi disinda bir sey yapamayiz
		
		
	    // Siniftaki ogrencilerin isimlerini bir listeye ekleyip yazdiralim
		
		List<String> valueList = new ArrayList<>((sinif.values()));
		System.out.println(valueList );
		
		System.out.println(valueList.size()); // 4
		
		List<String> isimListesi = new ArrayList<>();
		String bilgiler[] = new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			
		bilgiler = valueList.get(i).split(",");
		isimListesi.add(bilgiler[0]);
			
		}
			
		System.out.println(isimListesi); // [Ali, Veli, Ali, Ayþe]
		
		
		
	}

}
