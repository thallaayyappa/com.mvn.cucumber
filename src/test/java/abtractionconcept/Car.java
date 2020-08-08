package abtractionconcept;

public interface Car {

	final int wheels=4;
	
	//full abstraction and we can only have only abstract methods we cannot have non abstract methods
	//all the methods are abstract in nature no method body only declaration
	//cannot create the object of interface class
	
	public void start();
	public void stop();
	public void refuell();
	
	
}
