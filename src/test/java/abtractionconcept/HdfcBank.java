package abtractionconcept;

public class HdfcBank extends RBIBank {



@Override
public void loan() {
	// TODO Auto-generated method stub
	
	System.out.println("implementing abstract method");
	
}

//internal method of hdfcbank

public void homeloan() {
	System.out.println("HDFC internal method");
}

}