import java.util.Random;
import java.util.Scanner;

enum Coin{
	HEADS,TAILS;
}

public class question6_29 {
	
	//defining a method 
	public void flipsCooin() {
		int head = 0;
		int tail = 0;
		int choice = 0 ;
		int totalToses = 0;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("1. please toss a coin");
		System.out.println("2. exit");
		System.out.println("");
		
		//this keeps run as long as remains true
		while(true) {
			System.out.println("please 1 for toss or 2 for quit");
			choice = sc.nextInt();
			
			if(choice == 1) {
				int randomNumber = r.nextInt(2); //to generate a random number
				totalToses++;
				Coin result = (randomNumber == 0)? Coin.HEADS : Coin.TAILS;
			
				//defining a switch case
			switch(result) {
				case HEADS:
					head++;
					break;
					
				case TAILS:
					tail++;
					break;
				}
			}
			else if(choice == 2) {
				System.out.printf("Total tossed %d" , totalToses);
				
				break;
			} else {
				System.out.println("Invalid in put");
			}
			System.out.println("Heads " + head + " times");
			System.out.println("Tail " + tail + " times");
			
		}
		
		
		
		
	}
}
