package SortVarargs;

public class SortNumber {
	
	// A method that takes variable number of integer arguments. 
	static void SortNumbers(int ...numbers) 
    { 
        System.out.println("\nNumber of arguments: " + numbers.length);
        System.out.print("Before sort numbers are: ");
        for (int i=0; i<numbers.length; i++) {
         System.out.print(numbers[i]+ " ");
        }     
                
        // using for each loop to display contents of numbers 
        for (int i=0; i<numbers.length; i++) {
        	for (int j=0; j<numbers.length; j++) {
        		if(numbers[j]<=numbers[i]) {
        			int shift = numbers[j];
        			numbers[j]=numbers[i];
        			numbers[i]=shift;
        		}
        	}        	
        }

        System.out.print("\nAfter sort numbers are: ");
        for (int i=0; i<numbers.length; i++) {
         System.out.print(numbers[i]+ " ");
        }

     }	
}
