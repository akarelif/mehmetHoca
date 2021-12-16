package day42_abstractClasses;

public abstract class AbsPersonel {
	
	// Class ve method'u abstract olarak tanimladigimda child class'lar mecburen
	// Bu method'u override edecekler
	
	
	public abstract void statu();
	
	public abstract void abstractMethod();
		
	public void concreteMethod() {
		System.out.println("Personel Class'indaki Concrete  Method Calisti");
	}
	}
 