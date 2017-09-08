import java.util.Scanner;

public class MCDriver {
	
	public static void main(String[] args){
		Message msg = new Message();
		
		//call method to get input from user
		String inputMessage = getUserInput();
		inputMessage.toLowerCase(); //convert message to all lower
		
		for(int index=0; index < inputMessage.length(); index++){
			char currentChar = inputMessage.charAt(index); //the access the i-th character in the string
			//msg.morsify(currentChar, msg); //turn the character into a morse code signal
			msg.convertCharToCode(currentChar);
		}
	}

	private static String getUserInput() {
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		
		System.out.println("Enter a word or phrase to be coded."); 		//prompt user
		userInput = keyboard.nextLine();
		
		return userInput;
	}
	
	private static void printOutCasesForSwitch(){
		//print out the cases because this should be easier
		char caseVariableLower = 'd';
		char caseVariableUpper = 'D';
		//case 'a': A();
		
		//so I wrote a method to automate it
		//write code that writes code for you
		for(int i=0; i<23; i++){
			System.out.println("case \'" + caseVariableLower + "\': " + caseVariableUpper + "();" + " break;" );
			caseVariableLower++;
			caseVariableUpper++; 
		}
	}
}
