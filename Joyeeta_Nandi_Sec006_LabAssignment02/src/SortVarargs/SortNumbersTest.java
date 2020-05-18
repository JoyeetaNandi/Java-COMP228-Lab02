package SortVarargs;

public class SortNumbersTest {

	public static void main(String[] args) {		
		
	    { 
	        // Calling the SortNumbers method with different number of parameters 
	    	
	    	SortNumber.SortNumbers(123);// one parameter 
	    	System.out.println();
	    	SortNumber.SortNumbers(1, 9, 3, 5);  // four parameters 
	    	System.out.println();
	    	SortNumber.SortNumbers();// no parameter 
	    } 

	}

}
