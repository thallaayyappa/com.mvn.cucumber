package abtractionconcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuell();
		
		Car c =new BMW();//parent referencing or dynamic polymorphisim child class object 
		//can be refrenced by parent class or interface reference variable
		c.start();
		c.stop();
		c.refuell();
		b.safety();

	}

}
