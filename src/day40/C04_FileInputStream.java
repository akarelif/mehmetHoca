package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	
	public static void main(String[] args) throws FileNotFoundException {
		 
		// Java'da bir dasyaya ulasmak istedigimizde FileINputStream class'indan yardim aliriz
		
	
		
		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
		
		// Java bu kodda olasi  bir problem ongoruyor
		// Ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// Yani alti cizilen her kod CTE degildir
		
		// Bunun  icin iki durum soz konusu
		// 1- try catch kullanarak bu problemi HANDLE edip Java 'nin yoluna devam etmesini saglayabiliriz
		// 2- Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu
		// Ve sorumlulugun bizde oldugunu java'ya soylemeliyiz
		
		System.out.println("Görev Tamamlandi");
	}
	

}
