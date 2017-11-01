/*Implement a class that checks whether a given number is a prime using Thread class*/


package Core_Java_Assignment8_2;

	import java.util.Scanner; // import scanner class

	public class PrimeUsingThread extends Thread
	{
		int number;
		PrimeUsingThread(int s) { number = s; }
		public void run()	
		    {	  
	       
			 for(int i=2; i<=number/2; i++){
		            if(number % i == 0){
		            	System.out.println("It's Not Prime Number");	
		            	break;
		            }
		            else
		            {
		            	 System.out.println("It's Prime Number");
		            	 break;
		            }
		        }
			// System.out.println("Prime");      
		    }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int no;
				
				Scanner sc = new Scanner(System.in); // Scanner to take input from user.
				//Print the value
				System.out.println("Enter number to check prime : ");
				
				no=sc.nextInt(); // Initialize age variable	
				//Close Scanner
				sc.close();
						
				  Thread t = new Thread(new PrimeUsingThread(no));
				   t.start();
		}

	}
