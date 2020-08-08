package abtractionconcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HdfcBank hb = new HdfcBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.homeloan();
		
		RBIBank rb =new HdfcBank();
		rb.credit();
		rb.debit();
		rb.loan();
	
		
		
		}

	}


