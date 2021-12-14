package day40;

import java.io.FileInputStream;
import java.io.IOException;

public class C06_ParetChildException {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
			int k=0;
		    while((k=fis.read())!=-1) {
		        System.out.print((char)k);
		    }
		}catch (IOException e) {
			
			
		
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.println("Görev Tamamlandi");
		
		
	



	}

}
