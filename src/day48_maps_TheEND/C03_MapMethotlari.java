package day48_maps_TheEND;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class C03_MapMethotlari {

	public static void main(String[] args) {
		
		Map<Integer,String> ornek = MapOlustur.myMap();
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110)); // false
		System.out.println(ornek.containsValue("JAVA")); // false
		System.out.println(ornek.containsValue("Mustafa, Kan, JAVA")); // true
		
		Set<Entry<Integer, String>> entrySet = ornek.entrySet(); // Her bir eleman entry 101=Ali, Can, java gibi
		
		int sayac = 1;
		for (Entry<Integer,String> each : entrySet) {
			System.out.println(sayac +".entry : " + each);
			sayac++;
			
		}
		System.out.println(ornek.getOrDefault(110, "Girilen Key Map'de Yok"));
		System.out.println(ornek.getOrDefault(103, "Girilen Key Map'de Yok"));
		
		ornek.putIfAbsent(103, "Ali, Yan, C#"); // Eklemeyecek
		ornek.putIfAbsent(110, "Fikri, Yan, Qa"); // Ekleyecek
		
		 sayac = 1;
		for (Entry<Integer,String> each : entrySet) {
			System.out.println(sayac +".entry : " + each);
			sayac++;
			
	}
		
		String maptenString = ornek.toString();
		System.out.println(maptenString);
	}
}
