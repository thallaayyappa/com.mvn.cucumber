package abtractionconcept;

public abstract class RBIBank {
	
	int amt=100;
	final int rate=10;
	static int loanrate =5;
	
	//abstract method and any class implementing this should implement the logic in that class
	//in abstract class you can have both abstract and non abstract methods
	//partial abstraction(hiding the implementation logic
	//cannot create an object on abstract class and interface class
	
	public abstract void loan();
	
	//non abstract methods
	public void credit() {
		System.out.println("abstract class non abstract method");
	}
	
	public void debit() {
		System.out.println("abstract class non abstract debit method");
	}
}
