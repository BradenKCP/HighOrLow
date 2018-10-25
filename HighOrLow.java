import java.util.Random;
import java.util.Scanner;
 
/**
 * 
 * @author Braden Hearn
 *
 */
 
public class HighOrLow {
 
   public static void main(String[] args) {

    int guess = -2;
	int guesses = 0;
	boolean playing = true; 
	
	while (playing == true){
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int number = random.nextInt(100);
		while (guess!=number) {
			
	        System.out.print("Enter your guess: (-1 to quit): ");
			guess = scanner.nextInt();
			
			if(guess == -1){
				break;
				}
			else if (guess<number) {
				System.out.println("Too low, guess again");
				guesses++;
	             } 
			else if (guess>number) {
				System.out.println("Too high, guess again");
				guesses++;
				 }
			 
			else {
				guesses++;
				System.out.println("Correct, the number was " + number + ". It took you " + guesses + " tries.");
				break;
				}
		 }
		if(guess == -1){
				break;
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to play again? (Y/N): ");
		String answer = input.nextLine();
		playing = answer.equalsIgnoreCase("y");
		guesses = 0;
		guess = -2;
		
	  }
  }
}
