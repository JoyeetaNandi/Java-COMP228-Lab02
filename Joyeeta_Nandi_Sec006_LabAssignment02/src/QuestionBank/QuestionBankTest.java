package QuestionBank;
public class QuestionBankTest {

	public static void main(String[] args) {
		
		QuestionBank test = new QuestionBank();			
		
		// use for loop to display 5 questions
		for (int i = 1; i <= 5; i++) {			
			QuestionBank.simulateQuestion(i);
			test.inputAnswer(i);			
		}		
		//function to count correct and incorrect question and calculate percentage
		System.out.println("Correct Answers: "+ test.correctAnswer+", incorrect:"+
		(5 - test.correctAnswer) +", Percentage:"+(test.correctAnswer*(100/5)));
		
	}

}
