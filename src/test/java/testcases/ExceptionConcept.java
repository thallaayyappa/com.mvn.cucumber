package testcases;

public class ExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=10;
		System.out.println(i/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catching this divide by zero exception"+ e.getMessage());
		}

	}

}
