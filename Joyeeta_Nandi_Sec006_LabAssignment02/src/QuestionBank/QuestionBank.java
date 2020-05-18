package QuestionBank;
import java.util.Random;
import java.util.Scanner;

public class QuestionBank {
	private static int questionNumber;
	public int correctAnswer;
		
	// create Scanner for input from command window
    private Scanner input = new Scanner(System.in);
    
	// start simulateQuestion method
	public static void simulateQuestion(int qNumber) {
		
		questionNumber = qNumber;
		
		if (questionNumber == 1) {
			System.out.println("Q1: When a method terminates, "
					+ "the values of its local variables are ________.   ");
			System.out.println("\t1. saved ");
			System.out.println("\t2. copied ");
			System.out.println("\t3. restored ");
			System.out.println("\t4. lost ");			
		}	
		
		else if (questionNumber == 2) {
			System.out.println("Q2: You must call most methods other than ________ "
					+ "explicitly to tell them to perform their tasks.");					
			System.out.println("\t1. public methods ");
			System.out.println("\t2. main ");
			System.out.println("\t3. static methods");
			System.out.println("\t4. private methods");
		}
		else if (questionNumber == 3) {
			System.out.println("Q3:When method printf requires multiple arguments, "
					+ "the arguments are separated with ________. ");
			System.out.println("\t1. colons (:).");
			System.out.println("\t2. semicolons (;).");
			System.out.println("\t3. commas (,). ");
			System.out.println("\t4. periods (.).");
		}
		if (questionNumber == 4) {
			System.out.println("Q4: Which of the following does not contain a syntax error? ");
			System.out.println("\t1. System.out.println('Hello world!'):");
			System.out.println("\t2. System.out.println(\"Hello                       world!\");");
			System.out.println("\t3. System.out.println(\"Hello world!\");  ");
			System.out.println("\t4. System.out.println(Hello world!); ");
		}
		
		if (questionNumber == 5) {
			System.out.println("Q5: Which command compiles the Java source code file "
					+ "Welcome.java?");
			System.out.println("\t1. cd Welcome.java ");
			System.out.println("\t2. javac Welcome.java ");
			System.out.println("\t3. java Welcome.java  ");
			System.out.println("\t4. java Welcome.java ");
		}
		
	}// end simulateQuestion method
	
	// start generateMessage method
			public String generateMessage(boolean correct) 
			{					
				Random randomObject = new Random();
				
				//Start random congratulatory (message) if statement				
				
				if(correct) 
				{				
					switch(randomObject.nextInt(4)) //Start correct answers random switch loop
					{
						case 0:
							return "Very good";
							
						case 1:
							return ("Excellent");
							
						case 2:
							return ("Nice work");
							
						default:
							return ("Keep up the good work");					
					}// end correct answers random switch loop			
						
				}//end correct answers random statement
				
				else {
					switch(randomObject.nextInt(4)) //Start incorrect random message switch loop
					{
					case 0:
						return "No. Please try again";
						
					case 1:
						return ("Wrong. Try once more");
						
					case 2:
						return ("Don't give up!");
						
					default:
						return ("No.Keep trying..");
					} //end incorrect answers random message switch loop
					
				} //end random congratulatory (message) if statement
				
			}// end generateMessage method
			
	
	// start checkAnswer method
		public void checkAnswer(int choice) {
			if (questionNumber == 1)
			{
				if(choice == 4) 
				{
					System.out.println(generateMessage(true));
					System.out.println();
					correctAnswer++;
				}
			
				else 
					System.out.println(generateMessage(false));				
			}
			
			if (questionNumber ==2 )
			{
				if(choice == 2)
				{
					System.out.println(generateMessage(true));	
					System.out.println();
					correctAnswer++;
				}				
				else 
					System.out.println(generateMessage(false));				
			}
			
			if (questionNumber == 3)
			{
				if(choice == 3)
				{
					System.out.println(generateMessage(true));
					System.out.println();
					correctAnswer++;
				}
				else 
					System.out.println(generateMessage(false));				
			}
			
			if (questionNumber == 4)
			{
				if(choice == 3)
				{
					System.out.println(generateMessage(true));	
					System.out.println();
					correctAnswer++;
				}
				else 
					System.out.println(generateMessage(false));
				
			}
			
			if (questionNumber == 5)
			{
				if(choice == 2) 
				{
					System.out.println(generateMessage(true));
					System.out.println();
					correctAnswer++;
				}
				else 
					System.out.println(generateMessage(false));				
			}			
				
		}// end checkAnswer method
		
		
		// start inputAnswer method		
		public void inputAnswer(int position){
					
				System.out.print("Enter the correct answer: ");				
				int choice = input.nextInt();
				checkAnswer(choice); 			
		}// end inputAnswer method		 

} // end QuestionBank class
