
public class question6_25 {
	
	
	//function for determining whether a number is prime number or not and use it to display all primes number less than 10000
	// and display a number up to 10000
	public static Boolean primeNumber(int num) {
		if(num <= 1) {
			return false;
		}
		
	   for(int i= 2; i< num; i++) {
		   if(num % i==0)
		   {
			   return false;
		   }
		 
	   }
	   return true;
		
	}
	
	//The function of testing number times of prime number
	
	public static int primeNumberTest(int num) {
		int count = 1;
		int upperLimit= num/2;
		for(int i=2; i< upperLimit; ++i ) {
			count ++;
			
			if(num %i ==0) {
				
				
			}
			
		}
		return count;
		
		
	}
	
	//function that only go as high as the square root of n
	
	public static int primeNumberHighSquareRoot(int num) {
		int count = 1;
		int upperLimit= (int) Math.sqrt(num);
		
		for(int i=2; i< upperLimit; ++i ) {
			count ++;
			
			if(num %i ==0) {
				
				
			}
			
		}
		return count;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int j = 0; j<	10000; j++ ) {
			if(primeNumber(j)) {
				count ++;
				System.out.println("The prime number count " + count + " is " +j);
				
			}
		}
		System.out.print("\n");
		System.out.println("number of times it tested :" + primeNumberTest(10000));
		
		System.out.print("\n");
		System.out.println("number of tested the square root :" +  primeNumberHighSquareRoot(10000));
		
		
		
	}
	

}
