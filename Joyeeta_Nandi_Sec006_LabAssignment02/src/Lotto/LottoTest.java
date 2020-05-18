package Lotto;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int counter = 1; counter <= 5; counter++) {
			Lotto lotto = new Lotto();
			
			System.out.print("Enter a number from 3 to 27: ");
			int number1 = input.nextInt();
			if (number1>=3 && number1<=27) {
	        if(number1 == lotto.result()) 
	        {
	        	System.out.println("User wins.");
	        	break;
	        }
	        else
	        {
	        	System.out.println("Computer wins.\n");
	        }
			}
			else {
				System.out.println("Number should be in between 3 to 27." + "Try again.");
				System.out.println();
				counter--;
			}
				
		// 
	}
		// loop 20 times
	      

	}

}
