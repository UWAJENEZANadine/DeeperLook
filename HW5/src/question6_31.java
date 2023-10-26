import java.util.Random;
import java.util.Scanner;

public class question6_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int result; //The number to be guessed
		int guess = 0; //the times number of user has guess
		
		
		//starting a game
		int userGuess;
		result = 1 + r.nextInt(1000);
		System.out.println("Guess a number between 1 and 1000");
		
		//play the game
		System.out.println("Guess 0 to exit: \n");
		userGuess = sc.nextInt();
		
		
		while(userGuess != 0) {
			 guess ++;
			 
			 if(userGuess < result) {
				 System.out.printf("%d is too low. Try again\n ", userGuess);
				 
			 }else if(userGuess > result) {
				 System.out.printf("%d is too high. Try again\n ", userGuess);
			 }else {
				 //guess correctly
				 System.out.printf("Congratulations! You guessed the number in  %d tries\n ", guess);
				 
				 if(guess <10) {
					 if(guess == 10) {
						System.out.printf("Aha! you know the secret\n");
					 }else {
						 System.out.printf("Either you know the secret or you got lucky \n");
					 }
						 
				 }else {
					 System.out.printf("You should be able to do better \n");	 
				 }
				 
				 
				 //Start new game
				 guess = 0;
				 result = 1 + r.nextInt(1000);
				 System.out.println("Guess a number between 1 and 1000");
					
			 }
			 System.out.println("Guess 0 to exit: ");
			 userGuess = sc.nextInt();
				
			 
			 
		}

	}

}


